package com.comparibles;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptops>laps=new ArrayList<Laptops>();
		
		laps.add(new Laptops("lenovo",1500000,12));
		laps.add(new Laptops("dell",200000,10));
		laps.add(new Laptops("hp",2005000,20));
		Collections.sort(laps);
		for(Laptops l:laps) {
			System.out.println(l);
		}
	}

}
