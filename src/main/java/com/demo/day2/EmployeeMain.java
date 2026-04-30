package com.demo.day2;  // it (package) should be the first stmt  in all  .java file

import com.demo.day1.Product;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.employeeId = 12345;
		emp1.employeeSalary = 40000;
		emp2.employeeId = 34567;
		emp2.employeeSalary = 60000;

		emp1.calculateBonus();
		emp1.printDetail();
		System.out.println(" Employee Id = " + emp1.employeeId);
		System.out.println("--------------------------");
		emp2.calculateBonus();
		emp2.printDetail();
		//employeeId cannot be resolved to a variable
		// employeeId=10034; - either we have to declare a variable, or we like to access
		// instance variable then we should access along with its instance
        // if I access employeeId, it is not belong to any instance, it will be 
		//treated as a separate variable
		
		//x is of type int
		int x=10, y;
		y=x;
		//value of y  ->10
		//emp3 is of type Employee
		//Employee  emp3;   // emp3  value   -->  null
		System.out.println("--------------------------");

		Employee  emp3 = emp2;
		// emp3 also refer the same object (emp2)
		//emp2 and emp3 - refer the same object
		//one object -  multiple reference variable
		emp3.printDetail();
		emp3.employeeSalary=65000;
		System.out.println("Employee Salary = " +emp2.employeeSalary);
		System.out.println("Employee Salary = " +emp3.employeeSalary);
		emp3.printDetail();
		emp2.printDetail();

		emp3=null;
		Employee   emp4 = null;
		if (emp4==null) {
			System.out.println("emp4 is null");
		}
		else {
			System.out.println("emp4 is not null");
		}
		
		//it search it in the current  package for Product, it is not available
		//so we have to import from the required   package
		//Product p1 = new Product();
		
		Product p1 = new Product();
	}

}
