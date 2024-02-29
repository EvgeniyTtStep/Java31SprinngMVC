package org.itstep.controller;

import org.itstep.dao.hibernate.FirmHibernate;
import org.itstep.model.Developer;
import org.itstep.model.Firm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

@Controller
public class FirmController {

    private FirmHibernate firmHibernate;

    @Autowired
    public void setFirmHibernate(FirmHibernate firmHibernate) {
        this.firmHibernate = firmHibernate;
    }

    @GetMapping("/single/firm/{idFirm}")
    public String firm(@PathVariable(name = "idFirm") Integer idFirm, Model model) {
        Firm firmById = firmHibernate.getById(idFirm);
        Set<Developer> developers = firmById.getDevelopers();
        System.out.println("Developers: " + developers);
        model.addAttribute("firm", firmById);
        model.addAttribute("developers", developers);
        return "firm";
    }


}
