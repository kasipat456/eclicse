package overloading;

public class Mainsum {

	public static void main(String[] args) {
		Sum cal = new Sum();
		
		int totalOne = cal.add(1, 2);
		System.out.println(totalOne);
		
		float totalTwo = cal.add(1.5f, 2.5f);
		System.out.println(totalTwo);
		
		int totalThree = cal.add(1,2,3);
		System.out.println(totalThree);
		
		float totalFour = cal.add(1.1f,2.2f,3.3f,4.4f);
		System.out.println(totalFour);
		
		double totalFive = cal.add(12.1,22.2,33.3,44.4,55.5);
		System.out.println(totalFive);
		
		
	}

}
