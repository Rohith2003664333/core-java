package com.tsnf.staticclass;

public class Myclass {
	private int section=2;//instance variable 
	static int srNo;//static variable
	static {
		System.out.println("----static block----");
		srNo=1000;
		//section is not accessable because its not a static 
		
	}
	public Myclass() {
		super();
		System.out.println("----Default contructor---");
		
	}
	static void display() {
		System.out.println("--static method---");
		System.out.println("increment of srno"+srNo++);
		
		
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	

}
