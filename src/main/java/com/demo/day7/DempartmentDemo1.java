package com.demo.day7;

import java.util.HashSet;
import java.util.Set;

public class DempartmentDemo1 {

	public static void main(String[] args) {
		Set<Department> departmentSet = new HashSet<>();
		departmentSet.add(new Department(10, "Sales", "Chennai"));
		departmentSet.add(new Department(20, "Admin", "Pune"));
		departmentSet.add(new Department(30, "Production", "Chennai"));
		departmentSet.add(new Department(10, "Sales", "Chennai"));
		departmentSet.add(new Department(10, "Marketing", "Chennai"));

		for (Department department : departmentSet) {
			System.out.println(department);
		}

	}

}
