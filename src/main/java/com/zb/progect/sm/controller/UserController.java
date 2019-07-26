package com.zb.progect.sm.controller;

import com.zb.progect.sm.entity.User;
import com.zb.progect.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService  us;

    @RequestMapping(value = {"/list","/"})
    public String findAll(String name, Model model,HttpSession session){
        session.getServletContext().setAttribute("findrole",us.findRole());
        model.addAttribute("find",us.findAll(name));
        return "find";
    }

    @RequestMapping(value = {"/addI"})
    public String addI(){

        return "insert";
    }
    @RequestMapping("/add")
    public String addInfo(User user,Model model){
        System.out.println(user);
        int add = us.addInfo(user);
        model.addAttribute("addInfo",add);
        if (add > 0){
            model.addAttribute("find",us.findAll(null));
            return "find";
        }else {
            model.addAttribute("msg","新增失败！！！");
        }
        return "insert";
    }
}
