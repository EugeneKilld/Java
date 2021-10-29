package com.company;

public class Employee {

    private String name;
    private String job_title;
    private String email;
    private String phone;
    private int salary; // зарплата
    private int age;
    private boolean vaccine;

    public Employee(){
        this.name = "Ivanov Ivan";
        this.job_title = "Engineer";
        this.email = "email";
        this.phone = "+79373648217";
        this.salary = 70000;
        this.age = 34;
        this.vaccine = true;
    }

    public Employee(String name, String job_title, String email, String phone, int salary, int age, boolean vaccine){
        this.name = name;
        this.job_title = job_title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.vaccine = vaccine;
    }

    public void show(){
        System.out.printf("Name: %s; Job title: %s; Email: %s; Phone: %s; Salary: %d; Age: %d; Vaccine: %b \n",
                name, job_title, email, phone, salary, age, vaccine);
    }

    public boolean getVaccine(){
        return vaccine;
    }
}
