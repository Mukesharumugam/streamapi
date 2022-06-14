package com.streamapi;

public class Student {
	String name;
	int rollno;
	int mark;
	public Student(String name, int rollno, int mark) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", mark=" + mark + "]";
	}
	
}
