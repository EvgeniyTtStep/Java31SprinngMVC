package org.itstep.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Component
@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @Column(name = "id_skill")
    private Integer idSkill;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "skillSet")
    private Set<Developer>developerSet;

    public Skill() {
    }

    public Skill(Integer idSkill, String name, Set<Developer> developerSet) {
        this.idSkill = idSkill;
        this.name = name;
        this.developerSet = developerSet;
    }

    public Integer getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Integer idSkill) {
        this.idSkill = idSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Developer> getDeveloperSet() {
        return developerSet;
    }

    public void setDeveloperSet(Set<Developer> developerSet) {
        this.developerSet = developerSet;
    }
}
