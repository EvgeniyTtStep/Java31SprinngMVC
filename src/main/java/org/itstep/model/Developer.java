package org.itstep.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

@Component
@Entity
@Table(name = "developers")
public class Developer {
    @Id
    @Column(name = "id_developers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDeveloper; //id_developer
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @ManyToOne
    @JoinColumn(name = "firm_id")
    private Firm firm;
    @ManyToMany
    @JoinTable(
            name = "developers_skills",
            joinColumns = @JoinColumn(name = "developer_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
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
