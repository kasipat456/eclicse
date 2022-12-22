package HOME;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();

		car1.setPlateNumber("§§ 1018");
		car1.setbrand("honda");
		car1.setpurchaseYear(1900);
		
		System.out.println("PlateNumber: " +car1.getPlateNumber());
		System.out.println("Brand: "+car1.getbrand());
		System.out.println("purchaseYear:"+car1.getpurchaseYear());
		
		Person per1 = new Person();
		
		per1.setId("4567");
		per1.setName("Kasipat");
		
		System.out.println("ID: "+per1.getId());
		System.out.println("Name: "+per1.getName());
		
		per1.setVehicle(car1);
		
		per1.getVehicle().setPlateNumber("C0001");
		per1.getVehicle().setbrand("Toyota");
		per1.getVehicle().setpurchaseYear(1000);
		
		System.out.println("PlateNumber2: "+per1.getVehicle().getPlateNumber());
		System.out.println("Brand: "+per1.getVehicle().getbrand());
		System.out.println("Year: "+per1.getVehicle().getpurchaseYear());
	}

}
