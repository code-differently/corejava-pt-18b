package com.codedifferentlt.labs.lab18b.part2.examples.example02;

public class Employee {
    private static Integer idIndex = 1;
    private Integer id;
    private String name;

    public Employee(String name){
        this.id = idIndex++;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Id("+id + ") " + name;
    }
}
