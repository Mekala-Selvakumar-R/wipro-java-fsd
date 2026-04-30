package com.demo.day2;

public class Employee{
	//instance variable
	// these variables are created when you create an instance 
	// it belongs to the instance (object), without instance we can't access these varaiable
 int employeeId;
	double employeeSalary;

	 //method
	// here no access specifier - default - package level - visibility - only within the current package
	void calculateBonus() {
		double bonus; // local variable
		if (employeeSalary > 50000) {
			bonus = (10.0 / 100) * employeeSalary;
		} else {
			bonus = (25.0 / 100) * employeeSalary;
		}
		System.out.println("Bonus = "+ bonus);
	}

	void printDetail() {
		System.out.println(employeeId + "  " + employeeSalary);
		//bonus cannot be resolved to a variable
		//System.out.println(bonus); // it is declared in calculateBonus, its visibility is only within that method
									// alone, you can't access it outside the method
	}

}
