package com.itany.test1;

public class Employee {
	
	public Employee(){
		
	}
	public Employee(String name,String sex,double salary){
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String name;
	private String sex;
	private double salary;

}
