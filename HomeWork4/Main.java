package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Kildibaev Eugene Vladimirovich", "Programmer", "dr.jacksik@gmail.com",
                "+79273359673", 150000, 22, true);
        employeesArray[1] = new Employee("Mannanova Alsu", "Programmer", "alsu@gmail.com",
                "+79364219735", 120000, 18, true);
        employeesArray[2] = new Employee("Sharif'anov Niyaz", "Programmer", "niyaz@gmail.com",
                "+79993642863", 145000, 24, false);
        employeesArray[3] = new Employee("Gall'amov Fanzil'", "Programmer", "fanzil@gmail.com",
                "+79357862456", 150000, 22, false);
        employeesArray[4] = new Employee();

        for (Employee empl: employeesArray){
            if (empl.getVaccine()) {
                empl.show();
            }
        }

    }
}


