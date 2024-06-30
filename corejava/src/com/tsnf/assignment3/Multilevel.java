package com.tsnf.assignment3;

public class Multilevel extends State{
	public static void main(String args[]) {
		State ob=new State();
		ob.setContinent_name("Asia");
		ob.setTotal_country(7);
		ob.setCountry_name("India");
		ob.setCountry_pm("modi");
		ob.setState_name("Karnataka");
		ob.setState_cm("Sidramulla");
		System.out.println(ob);
	}

}
