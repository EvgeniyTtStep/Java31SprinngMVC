package org.itstep.controller;

import org.itstep.dao.DeveloperDAO;
import org.itstep.dao.hibernate.DeveloperHibernate;
import org.itstep.model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeveloperController {



    private final DeveloperHibernate developerHibernate;

    @Autowired
    public DeveloperController(DeveloperHibernate developerHibernate) {
        this.developerHibernate = developerHibernate;
    }

    @GetMapping("/developers")
    public String getAllDevelopers(Model model) {
        List<Developer> developersAll = developerHibernate.getAll();
        model.addAttribute("developers", developersAll);
        return "developers";
    }

    @GetMapping("/developer/form")
    public String developerForm() {
        return "form";
    }

//    @PostMapping("/developer/form")
//    public String postDeveloperForm(@RequestParam(name = "name") String name,
//                                    @RequestParam(name = "phone") String phone) {
//        developerDAO.save(new Developer(name, phone));
//        return "redirect:/developers";
//    }


    @PostMapping("/developer/form")
    public String postDeveloperForm(@ModelAttribute Developer developer) {
        developerHibernate.save(developer);
        return "redirect:/developers";
    }


    @GetMapping("/single/developer/{phone}")
    public String getOne(@PathVariable String phone, Model model) {
        Developer byPhone = developerHibernate.getByPhone(phone);
        model.addAttribute("dev", byPhone);
        System.out.println(byPhone.getName() + " " + byPhone.getPhone());
        return "developer";
    }

}
