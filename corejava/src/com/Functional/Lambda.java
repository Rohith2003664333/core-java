package com.Functional;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		maxfinder finder=(num1,num2)->
		num1>num2?num1:num2;
		int result1=finder.maximum(10,20);
		System.out.println("lambda result:"+result1);
	 
	}
	

}
