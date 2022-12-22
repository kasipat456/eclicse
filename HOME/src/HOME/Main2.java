package HOME;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRacingcar toyota = new MyRacingcar();
		toyota.carname = "Toyota";
		toyota.runspeed = 150;
		toyota.weight = 1500;
		toyota.color = "red";
		toyota.spec();
		
		System.out.println();
		
		MyRacingcar honda = new MyRacingcar();
		honda.carname = "Honda";
		honda.runspeed = 120;
		honda.weight = 1600;
		honda.color = "blue";
		honda.spec();
	}

}
