package com.codedifferentlt.labs.lab18b.part2.examples.example02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void constructorTest01(){
        Employee employee01 = new Employee("Hakim");
        Employee employee02 = new Employee("Rahim");
        Employee employee03 = new Employee("Gabe");

        Integer expectedEmployee01Id = 1;
        Integer actualEmployee01Id = employee01.getId();

        Integer expectedEmployee02Id = 2;
        Integer actualEmployee02Id = employee02.getId();

        Integer expectedEmployee03Id = 3;
        Integer actualEmployee03Id = employee03.getId();

        Assertions.assertEquals(expectedEmployee01Id, actualEmployee01Id);
        Assertions.assertEquals(expectedEmployee02Id, actualEmployee02Id);
        Assertions.assertEquals(expectedEmployee03Id, actualEmployee03Id);
    }

}
