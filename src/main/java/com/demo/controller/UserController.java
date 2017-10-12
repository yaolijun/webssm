package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by yaolijun on 2017/10/11.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");



        return mav;
    }

    @RequestMapping("/showUser")
    public String showuser(HttpServletRequest request, Model model){
        User user = userService.selectUserById(1);
        model.addAttribute("user", user);

        return "showUser";
    }

}
