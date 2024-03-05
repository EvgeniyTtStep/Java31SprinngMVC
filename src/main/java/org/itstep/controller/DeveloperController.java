package org.itstep.controller;

import org.itstep.dao.hibernate.DeveloperHibernate;
import org.itstep.dao.hibernate.FirmHibernate;
import org.itstep.model.Developer;
import org.itstep.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
public class DeveloperController {

    private final DeveloperHibernate developerHibernate;

    private final FirmHibernate firmHibernate;

    @Autowired
    public DeveloperController(DeveloperHibernate developerHibernate, FirmHibernate firmHibernate) {
        this.developerHibernate = developerHibernate;
        this.firmHibernate = firmHibernate;
    }

    @GetMapping("/developers")
    public String getAllDevelopers(Model model) {
        List<Developer> developersAll = developerHibernate.getAll();
        model.addAttribute("developers", developersAll);
        model.addAttribute("firms", firmHibernate.getAll());
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
        Developer developerById = null;
        if (developer.getIdDeveloper() != null) {
            developerById = developerHibernate.getById(developer.getIdDeveloper());
        }

        if (developerById == null) {
            developerHibernate.save(developer);
        } else {
            developerHibernate.update(developer);
        }
        return "redirect:/developers";
    }


    @GetMapping("/single/developer/{phone}")
    public String getOne(@PathVariable String phone, Model model) {
        Developer byPhone = developerHibernate.getByPhone(phone);
        Set<Skill> skillSet = byPhone.getSkillSet();
        model.addAttribute("dev", byPhone);
        model.addAttribute("skills", skillSet);
        if (byPhone.getFirm() != null) {
            System.out.println("Developer: " + byPhone.getName() + " " + byPhone.getPhone() + " " + byPhone.getFirm().getName());
        }
        return "developer";
    }


    @GetMapping("/update/developer/{idDeveloper}")
    public String update(@PathVariable(name = "idDeveloper") Integer idDeveloper, Model model) {
        Developer developerById = developerHibernate.getById(idDeveloper);
        System.out.println("Before update = " + developerById.getName() + " " + developerById.getPhone());
        model.addAttribute("developer", developerById);
        return "form";
    }

    @GetMapping("/delete/developer/{idDeveloper}")
    public String delete(@PathVariable(name = "idDeveloper") Integer id) {
        developerHibernate.delete(id);
        return "redirect:/developers";
    }
}
