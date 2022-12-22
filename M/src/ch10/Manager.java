package ch10;

public class Manager extends Employee {
	private String department;
	
	public Manager(String id, String name, double salary, String department) {
		super(id,name,salary);
		this.department = department;
	}
	
	public String getDetail() {
		return super.getDetail()+" : "+department;		
	}  
}
