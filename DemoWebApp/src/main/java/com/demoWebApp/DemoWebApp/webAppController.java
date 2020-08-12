package com.demoWebApp.DemoWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class webAppController {
    @RequestMapping("new")
    public ModelAndView home(Person person){
        //HttpSession session = req.getSession();
        //String name = req.getParameter("name");
        ModelAndView mv= new ModelAndView();
        //session.setAttribute("name",name);
        mv.addObject("obj",person);
        mv.setViewName("home");
        System.out.println("App is working and name entered is "+person);
        return mv;
    }
}
