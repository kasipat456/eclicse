package ch10;

public class Main {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Manager("man1234","Somchai",80000,"IT");
		emp[1] = new Engineer("eng345","Tony",50000,"Electronic");
		
		for(Employee data : emp) {
			System.out.println(data.getDetail());
		}
		
	}

}
