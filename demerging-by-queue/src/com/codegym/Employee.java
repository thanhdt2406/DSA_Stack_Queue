package com.codegym;

public class Employee {
    private String name;
    private boolean gender;
    private String DoB;

    public Employee(){

    }

    public Employee(String name, boolean gender, String doB) {
        this.name = name;
        this.gender = gender;
        DoB = doB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }
}
