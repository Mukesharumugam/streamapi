package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortdemo {

	public static void main(String[] args) {
		List<Student> student = getData().stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (o1.getMark() - o2.getMark());
			}
		}).collect(Collectors.toList());
		student.forEach(System.out::println);
		System.out.println("***********************");
		List<Student> student1 = getData().stream()
				.sorted((Student o1, Student o2) -> (o1.getName().compareTo(o2.getName())))
				.collect(Collectors.toList());
		student1.forEach(System.out::println);
		System.out.println("############################");
		List <Student> student2 =  getData().stream().sorted((Student o1, Student o2) -> (o2.getRollno() - o1.getRollno()))
				.collect(Collectors.toList());
		student2.forEach(System.out::println);
	}

	public static List<Student> getData() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Jeff", 10, 350));
		list.add(new Student("Fazil", 21, 568));
		list.add(new Student("Mohideen", 8, 200));
		list.add(new Student("Prince", 18, 250));
		return list;
	}
}
