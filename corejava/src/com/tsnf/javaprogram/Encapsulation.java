package com.tsnf.javaprogram;

public class Encapsulation {
	//if no access sppecifier then it is default
	private int serialNum;//Data members
	private String name;
	private int age;
	
	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void show()//member function
	{		System.out.println("serinum is "+serialNum+"\t"+"name"+"\t"+name+"\t"+"age "+age);
	}
	

}
