package eu.pakhomov.projectplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //use pattern MVC - Model View Controller, C for Controller
            //we will use as well M package, and View will be used by Freemarker files in Templates
public class HelloController {
    @GetMapping("/") //this methods works when user enters our domen (/ after domain name added by browser)
    public String hello(Model model, @RequestParam String name) {
        //Model model & model.Attribute("name" - creates such a variable
        //@RequestParam - received from user
        model.addAttribute("name", name); //"name" - name of variable for freemarker, name - text from user
        return "hello"; //GetMapping above - so Spring understand that should
        //receive html or template for html - so Spring will check, and will find hello.ftl file
        //for example return "/hello" in case if hello.html or hello.ftl in some separate foder
    }
}
