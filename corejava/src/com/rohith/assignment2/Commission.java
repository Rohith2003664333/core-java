package com.rohith.assignment2;

import java.util.Scanner;

public class Commission {
    String Name, Address;
    long phone; 
    float Sales_amount;
    double commission;

    void Accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        Name = sc.nextLine();  

        System.out.println("Enter the address:");
        Address = sc.nextLine(); 
        
        System.out.println("Enter the phone number ");
        phone=sc.nextLong();
        
        System.out.println("Enter the sales_amount");
        Sales_amount=sc.nextFloat();
        
    }
    void commission() {
    	if(Sales_amount >=100000) {
    		commission=Sales_amount * 0.1;
    		System.out.println("commission is:"+commission);
    	}
    	else if(Sales_amount >= 50000 && Sales_amount <100000 ) {
    		commission=Sales_amount * 0.05;
    		System.out.println("commission is:"+commission);
    	}
    	else if(Sales_amount >=30000 && Sales_amount <50000) {
    		commission=Sales_amount * 0.03;
    		System.out.println("commission is:"+commission);
    	}
    }

}
