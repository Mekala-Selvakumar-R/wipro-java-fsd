package com.demo.day3;

import com.demo.day2.Employee;
import com.demo.day2.Item;

public class DemoEmployee {
public static void main(String[] args) {
	
	Employee emp = new Employee();
	//The method calculateBonus() from the type Employee is not visible
	// calculateBonus() - default access  specifier - package level
	// so inside the day2 only we can access the member of Employee
	//emp.calculateBonus();
	
	Item item = new Item();
	item.pub_id=1234;
	item.public_method();
	//only  public members are visible
	//we can't access private, package level member
	//item.pack_id=90;
	//item.pri_id=123;
//	item.private_method();
//	item.pack_method();
	
	
	
}
}
