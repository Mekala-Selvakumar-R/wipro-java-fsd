package com.demo.day7;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	List<Employee> employeeList;

	public EmployeeService() {
		employeeList = new ArrayList<>();

		employeeList.add(new Employee(111, "Arun Prakash", 32, "Male", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Keerthana Iyer", 25, "Female", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Vignesh Kumar", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Raghavendra Rao", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nandhini Subramanian", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Faisal Rahman", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Sathish Babu", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Dinesh Krishnan", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Meghana Reddy", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Pradeep Nair", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Lakshmi Narayanan", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Karthikeya Pillai", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothika Devi", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Manoj Varma", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Rahul Chandran", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Ananya Suresh", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Sriram Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
	}
}
