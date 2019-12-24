package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    //public Company(){}

    public void printSorted(){
        System.out.println("company = " + name);
        Collections.sort(employees);
        System.out.println("sorted =" + employees);
    }

    public String getName() {
     return this.name;
    }

    public void setName(String name) {
        if(name ==  null) {
            System.out.println("name can't be null");
            return;
        }else {
            this.name = name;
        }
    }

    public List<String> getEmployees() {
        return employees;
    }

//    public void setEmployees(List<String> employees) {
//        this.employees = employees;
//    }
//
    public void addEmployee(String name){
        if(name == null || name.isEmpty()){
            System.out.println("can't add null employee");
            return;
        }else {
            employees.add("name");
        }
    }
}
