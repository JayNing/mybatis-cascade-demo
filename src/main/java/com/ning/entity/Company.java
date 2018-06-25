package com.ning.entity;

import java.io.Serializable;
import java.util.List;

public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String name;

    private List<Department> departmentList;

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
        this.name = name == null ? null : name.trim();
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }
}