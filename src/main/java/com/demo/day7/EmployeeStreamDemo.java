package com.demo.day7;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
	public static void main(String[] args) {
		
		List<Employee> employeeList= new EmployeeService().employeeList;
		// How many male and female employees are there in the organization?

		long maleCount = employeeList.stream().filter(employee -> employee.getGender().equals("Male")).count();
		long FemaleCount = employeeList.stream().map(Employee::getGender).filter(str -> str.equals("Female")).count();
		System.out.println("Male Count =" + maleCount);
		System.out.println("Female Count =" + FemaleCount);

		Map<String, Long> genderCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCount);

		System.out.println("Distinct Departments");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		long count = employeeList.stream().map(Employee::getDepartment).distinct().count();
		System.out.println("Number of distinct departments: " +count);

		Map<String, Long> deptCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(deptCount);
		// What is the average age of male and female employees?

		Map<String, Double> averageMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(averageMap);

		Map<String, List<Employee>> byDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		// System.out.println(byDept);

		for (Map.Entry<String, List<Employee>> entry : byDept.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println("------------------------");
			for (Employee employee : entry.getValue()) {
				System.out.println(employee);
			}
		}

		double averageMale = employeeList.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male"))
				.map(Employee::getAge).collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(averageMale);

		// who is the highest employee?

		Employee emp1 = employeeList.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
		System.out.println(emp1);

		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		System.out.println(highestPaidEmployeeWrapper);

//  Get the names of all employees who have joined after 2015?

		employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

//Get the details of youngest male employee in the product development department?

		Optional<Employee> youngOptional = employeeList.stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("Product Development"))
				.filter(emp -> emp.getGender().equalsIgnoreCase("Male"))
				.min(Comparator.comparingInt(Employee::getAge));
		// .min((e1,e2)->e1.getAge()-e2.getAge());

		System.out.println(youngOptional.isPresent() ? youngOptional.get() : "Not found");

		// What is the average salary of each department?

		Map<String, Double> deptAvgSalary = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(deptAvgSalary);

		// Who has the most working experience in the organization?

		Employee employee = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		System.out.println(employee);

	}

}
