package com.jspiders.designpatterns.creational;

import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		
		try {
			factory().purchase(); 
			//factory() : will get repaced with address of particular child class object
			//which get stored inside the ref var of Mobile interface
			//and its puchase() will be overridden by particular child class purchase  
			
		} catch (NullPointerException e) {
			System.out.println("Nothing Is Purchased");
			e.printStackTrace();
		}
	}
	
	public static Mobile factory() {
		Mobile mobile = null;
		
		System.out.println("Enter 1 to pruchase Iphone"+
							"\nEnter 2 to pruchase Oneplus"+
							"\nEnter 3 to purchase Samsung");
		
		Scanner scanner = new Scanner(System.in);
		int choice  = scanner.nextInt();
		
		switch (choice) {
		case 1:
				mobile = new Iphone();
				break;
				
		case 2:
				mobile = new Oneplus();
				break;
			
		case 3:
				mobile = new Samsung();
				break;

		default:
				System.out.println("Invalid Input");
				break;
		}
		return mobile;
	}
}
