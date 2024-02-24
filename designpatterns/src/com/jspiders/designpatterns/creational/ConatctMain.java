package com.jspiders.designpatterns.creational;

public class ConatctMain {

	public static void main(String[] args) {
		
		Contact contact = new ContactBuilder().setFirstName("Arti").buildContact();
		
		//new ContactBuilder(): return the address of object of ContactBuilder class
		//and with the help of address we can call non static method of ContactBuilder class
		
		//new ContactBuilder().setFirstName("Arti") :  after setting the value , the method return the address of object of ContactBuilder class
		//and with the help of address we can call non static method of ContactBuilder class
		
		//new ContactBuilder().setFirstName("Arti").buildContact():
		//buildContact() return the object of Conatct class , then it will be stored in reference variable contact of Contact class
		 
		System.out.println(contact);
	}
}
