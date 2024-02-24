package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.structural.Employee;
import com.jspiders.designpatterns.structural.Event;

public class Adapter extends Employee implements Event {

	@Override
	public void womensDay() {
		System.out.println("The chief guest for Women's Day is "+getName());
	}

	@Override
	public void mensDay() {
		System.out.println("The chief guest for Men's Day is "+getName());
	}	
	
}
