package org.itstep.model;

public class Developer {

    private Integer idStudent;

    private String name;

    private String phone;

    public Developer() {
    }

    public Developer(Integer idStudent, String name, String phone) {
        this.idStudent = idStudent;
        this.name = name;
        this.phone = phone;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
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
