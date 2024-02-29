package org.itstep.model;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Developer {

    private Integer idDeveloper;

    private String name;

    private String phone;

    private Firm firm = new Firm();

    private Set<Skill>skillSet;

    public Developer() {
    }

    public Developer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Set<Skill> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(Set<Skill> skillSet) {
        this.skillSet = skillSet;
    }

    public Developer(Integer idDeveloper, String name, String phone) {
        this.idDeveloper = idDeveloper;
        this.name = name;
        this.phone = phone;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public Integer getIdDeveloper() {
        return idDeveloper;
    }

    public void setIdDeveloper(Integer idDeveloper) {
        this.idDeveloper = idDeveloper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
