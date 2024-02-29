package org.itstep.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Component
@Entity
@Table(name = "firms")
public class Firm {

    @Id
    @Column(name = "id_firm")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFirm;

    private String name;

    @OneToMany(mappedBy = "firm", fetch = FetchType.EAGER)
    private Set<Developer> developers = new HashSet<>();

    public Firm() {
    }

    public Firm(Integer idFirm, String name, Set<Developer> developers) {
        this.idFirm = idFirm;
        this.name = name;
        this.developers = developers;
    }

    public Integer getIdFirm() {
        return idFirm;
    }

    public void setIdFirm(Integer idFirm) {
        this.idFirm = idFirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }
}
