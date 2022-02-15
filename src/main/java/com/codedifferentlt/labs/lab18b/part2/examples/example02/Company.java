package com.codedifferentlt.labs.lab18b.part2.examples.example02;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private ArrayList<Employee> employees;

    public Company(){
        employees = new ArrayList<>();
    }

    private Employee hireEmployee(String name){
        Employee employee = new Employee(name);
        employees.add(employee);
        return employee;
    }

    private void displayAll(){
        System.out.println("\n***List of all Employees***");
        for(int i =0; i < employees.size(); i++){
            Employee employee = employees.get(i);
            System.out.println(employee.toString());
        }
        System.out.println("***End of List***\n");
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;

        while(flag){
            System.out.println("\nWelcome to CD Tech HR:");
            System.out.println("Press 1 to hire new person");
            System.out.println("Press 2 to print all employees");
            System.out.println("Press 5 to exit");
            Integer selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection){
                case 1:
                    System.out.println("Please enter name of new employee");
                    String name = scanner.nextLine();
                    Employee employee = hireEmployee(name);
                    System.out.printf("Just hired %s assigned id %d \n", name, employee.getId());
                    break;
                case 2:
                    displayAll();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Good bye");
                    break;
                default:

                    break;
            }

        }
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.run();
    }
}
