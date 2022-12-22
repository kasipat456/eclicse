package overloading;

public class Employee {
	private String id;
	private String name;
	private String email;
	private double salary;
	
	
	public Employee() {		
		System.out.println("New employee");
	}
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;		
		System.out.println("New employee: "+this.id+" : "+this.name);
	}
	public Employee(String id, String name, String email, double salary) {
		this.id 	= id;
		this.name  	= name;
		this.email 	= email;
		this.salary = salary;
		System.out.println("New employee: "+this.id+" : "+this.name+" : "+this.email+" : "+this.salary);
	}
	
}
