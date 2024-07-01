package com.tsnf.staticclass;

public class Student {
	private String name;//instance variables
	private int id;
	
	static String collagename="DBIT"; // STATIC VARIABLE

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
//	
//	
	

}
