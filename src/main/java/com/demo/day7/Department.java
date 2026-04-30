package com.demo.day7;

import java.util.Objects;

public class Department {
	private int departmentId;
	private String departmentName;
	private String location;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, String departmentName, String location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-20s%-20s",departmentId , departmentName,location);
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId, departmentName, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return departmentId == other.departmentId && Objects.equals(departmentName, other.departmentName)
				&& Objects.equals(location, other.location);
	}
	
	

}
