package HOME;

public class Person {
	private String id;
	private String name;
	private Car vehicle;
	
	public String getId() {
	 
		return id;
	}
	public void setId(String id) {
	
	 	this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  Car getVehicle() {
		return vehicle;
	}
	public void setVehicle(Car vehicle) {
		this.vehicle = vehicle;
	}
}