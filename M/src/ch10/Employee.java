package ch10;

public class Employee {
		
	
	private String id;
	private String name;
	private double salary;
	
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String getDetail() {
		return id+" : "+name+" : "+salary;
	}
}
