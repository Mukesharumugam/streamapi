package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo {

	public static void main(String[] args) {
		usingStreams();
		usingIteration();
	}
	
	public static void usingIteration() {
		List <Employee> list2 = getData();
		for (Employee emp : list2) {
			if (emp != null && emp.getSalary() > 1600) {
				System.out.println(list2);
			}
		}
	}

	public static void usingStreams() {
		List <Employee> list = getData().stream().filter((emp) -> emp.getSalary() > 1600 )
				.collect(Collectors.toList());
		list.forEach(System.out::println);
	}
	public static  List <Employee> getData() {
		List <Employee> emp = new ArrayList <Employee>();
		emp.add(new Employee("Mukesh",14,1600));
		emp.add(new Employee("Alan",9,78230));
		emp.add(new Employee("Aswini",18,78684));
		emp.add(new Employee("Kannan",10,8000));
		return emp;
	}
}
