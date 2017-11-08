package com.mjm.springdatarest.employeeapi.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    private Long  id;

    private String name;

    public Long getId() {
        return id;
    }

    public Long getResourceId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
