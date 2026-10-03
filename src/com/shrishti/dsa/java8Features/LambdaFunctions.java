package com.shrishti.dsa.java8Features;

import java.util.Arrays;
import java.util.List;

public class LambdaFunctions {

	List<LambdaEmployees> lambdaEmployees = Arrays.asList(new LambdaEmployees(1, "Rahul", "IT", 75000),
			new LambdaEmployees(2, "Priya", "HR", 55000), new LambdaEmployees(3, "Amit", "IT", 90000),
			new LambdaEmployees(4, "Neha", "Finance", 65000), new LambdaEmployees(5, "Riya", "IT", 80000));

	public void testLambda() {
		// before java8
		System.out.println("Before Java8 Lambda feature=====>");
		System.out.println("Employee from IT department : ");
		for (LambdaEmployees employee : lambdaEmployees) {
			if (employee.getDepartment() == "IT") {
				System.out.println(employee.getName() + ", ");
			}
		}
		System.out.println("Salary greater than 70k : ");
		for (LambdaEmployees employee : lambdaEmployees) {
			if (employee.getSalary() > 70000) {
				System.out.println(employee.getName() + ", ");
			}
		}

		// after java8
		System.out.println("After Java8 Lambda feature=====>");
		System.out.println("Employee from IT department : ");
		lambdaEmployees.forEach(name -> {
			if (name.getDepartment() == "IT") {
				System.out.println(name.getName() + ", ");
			}
		});
		System.out.println("Salary greater than 70k : ");
		lambdaEmployees.forEach(name -> {
			if (name.getSalary() > 70000) {
				System.out.println(name.getName() + ", ");
			}
		});

	}

}
