package com.yamini.bean;

import javax.persistence.*;

@Entity(name = "EmployeeTable")
public class Employee {
	@Id
	@Column(name = "EId")
	private int id;
	private String name;
	private String dept;
	private String designation;
	private double salary;

	public Employee() {
	}

	public Employee(int id, String name, String dept, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = Double.parseDouble(salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	
	

}
