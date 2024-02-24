package org.itstep.controller;

import org.itstep.dao.DeveloperDAO;
import org.itstep.model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {


    private final DeveloperDAO developerDAO;

    @Autowired
    public MyController(DeveloperDAO developerDAO) {
        this.developerDAO = developerDAO;
    }


    @GetMapping("/home") //@RequestParam - /home?name=Jack   це значення береться з форми
    public String home(@RequestParam(value = "name", required = false, defaultValue = "Bob") String name, Model model){
        System.out.println("name = " + name);
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/home/{city}") //@PathVariable - /home/Kiev
    public String cityHome(@PathVariable("city") String city, Model model){
        model.addAttribute("city", city);
        return "home";
    }







}
