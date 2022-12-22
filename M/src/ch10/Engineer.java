package ch10;

public class Engineer extends Employee {
	private String major;
	
	public Engineer(String id, String name, double salary,String major) {
		super(id,name,salary);
		this.major = major;
	}
	
	public String getDetail() {
		return super.getDetail()+" : "+major;
	}
}
