package com.basic.spring.basicspring.user;

import java.util.Date;

class User {
    private Integer id;
    private String name;
    private Date birthDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public User(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.birthDate = date;
    }

    @Override
    public String toString() {
        return "User [birthDate=" + birthDate + ", id=" + id + ", name=" + name + "]";
    }

    

    
}