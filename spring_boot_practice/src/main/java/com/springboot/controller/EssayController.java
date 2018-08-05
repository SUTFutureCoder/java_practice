package com.springboot.controller;

import com.springboot.dao.EssayDao;
import com.springboot.entity.Essay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

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

}
