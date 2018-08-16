package com.springmvc_practice.controller;

import com.springmvc_practice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("----登录验证----");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Cookie cookie = new Cookie("user", userName + "-" + password);
        cookie.setMaxAge(60 * 60);
        User currentUser = new User(userName, password);
        response.addCookie(cookie);
        HttpSession session = request.getSession();
        session.setAttribute("currentUser", currentUser);
        return "redirect:/main.jsp";
    }

    @RequestMapping("/login2")
    public String login2(HttpServletRequest request) {
        return "redirect:/main.jsp";
    }

    @RequestMapping("/login3")
    public String login3(HttpSession session) {
        return "redirect:/main.jsp";
    }

    @RequestMapping("/ajax")
    public @ResponseBody User ajax() {
        User user = new User("zhnagsan", "123321");
        return user;
    }

}
