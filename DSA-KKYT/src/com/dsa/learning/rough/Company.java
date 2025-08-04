package com.dsa.learning.rough;

import java.util.List;

public class Company {
    private int id;
    private String name;
    private List<Department> departmentList;

    public Company(int id, String name, List<Department> departmentList) {
        this.id = id;
        this.name = name;
        this.departmentList = departmentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
