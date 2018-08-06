package com.springboot.controller;

import com.springboot.dao.EssayDao;
import com.springboot.entity.Essay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@RestController
@RequestMapping("/essay")
public class EssayController {

    private static final Logger logger = LoggerFactory.getLogger(EssayController.class);

    @Resource
    private EssayDao essayDao;

    /**
     * 查询所有文章
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("essayList", essayDao.findAll());
        mav.setViewName("essayList");
        return mav;
    }


    @RequestMapping("/list2")
    public ModelAndView list2(Essay essay) {
        ModelAndView mav = new ModelAndView();
        List<Essay> essayList = essayDao.findAll(new Specification<Essay>() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate predicate = criteriaBuilder.conjunction();
                logger.warn(essay.toString());
                if (essay != null) {
                    if (essay.getEssayTitle() != null && !"".equals(essay.getEssayTitle())) {
                        predicate.getExpressions().add(criteriaBuilder.like(root.get("essayTitle"), "%" + essay.getEssayTitle() + "%"));
                    }
                }
                return predicate;
            }
        });
        mav.addObject("essayList", essayList);
        mav.setViewName("essayList");
        return mav;
    }


    /**
     * 添加文章
     *
     * @param essay
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Essay essay) {
        logger.warn(essay.toString());
        essayDao.save(essay);
        return "forward:/essay/list";
    }

    @RequestMapping("/preupdate/{id}")
    public String preUpdate(@PathVariable("id")Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("essay", essayDao.getOne(id));
        logger.warn(essayDao.getOne(id).toString());
        return essayDao.getOne(id).toString();
    }

    @PostMapping(value = "/update")
    public String update(Essay essay) {
        essayDao.save(essay);
        return "forward:/essay/list";
    }

    @GetMapping(value = "/delete")
    public String delete(Integer id) {
        essayDao.delete(essayDao.getOne(id));
        return "forward:/essay/list";
    }

    @ResponseBody
    @GetMapping(value = "/queryByName")
    public List<Essay> queryByName() {
        return essayDao.findByName("Post");
    }

    @ResponseBody
    @GetMapping("/randomList")
    public List<Essay> randomList() {
        return essayDao.randomList(2);
    }

}
