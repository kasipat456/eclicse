package ch2;

public class Main2 {

	public static void main(String[] args) {
		Scholarship scholarship1 = new Scholarship();
		
		scholarship1.setyear(2001);
		scholarship1.setvalue(20000);
		
		System.out.println("Year: "+scholarship1.getYear());
		System.out.println("value: "+scholarship1.getValue());
		
		University University1 = new University();
		
		University1.setname("Burapha");
		University1.setprovince("2001");
		
		System.out.println("Name: "+University1.getname());
		System.out.println("Provunce: "+University1.getprovince());
		
		University1.setmyScholarship(scholarship1);
		
		University1.getmyScholarship().setyear(2111);
		University1.getmyScholarship().setvalue(30000);
		
		System.out.println("Year: "+University1.getmyScholarship().getYear());
		System.out.println("Value: "+University1.getmyScholarship().getValue());
		
		

	}

}
