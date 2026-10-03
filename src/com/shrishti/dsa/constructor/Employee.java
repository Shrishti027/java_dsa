package com.shrishti.dsa.constructor;

public class Employee {
	
	String name;
    int age;

    Employee() {
        name = "Unknown";
        age = 0;
    }

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
   

}
