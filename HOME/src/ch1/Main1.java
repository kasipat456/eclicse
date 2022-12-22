package ch1;

public class Main1 {

	public static void main(String[] args) {
		Clock clock1 = new Clock();
		
		clock1.setbrand("Rolex");
		clock1.setpurchaseYear(2021);
		
		System.out.println("Brand: "+clock1.getBrand());
		System.out.println("purchaseYear: "+clock1.getPurchaseYear());
		
		Person1 per2 = new Person1();
		
		per2.setId("6341");
		per2.setName("Kasiapt");
		
		System.out.println("ID: "+per2.getId());
		System.out.println("Name:"+per2.getname());
		
		per2.setVehicle(clock1);
		
		per2.getVehicle().setbrand("Gucci");
		per2.getVehicle().setpurchaseYear(2000);
		
		System.out.println("Brand:"+per2.getVehicle().getBrand());
		System.out.println("Year:"+per2.getVehicle().getPurchaseYear());
		
	}

}
