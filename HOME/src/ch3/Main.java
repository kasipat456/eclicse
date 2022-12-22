package ch3;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.id  = "1249900626789";
		person1.name = "Kasiapt";
		person1.height  = 180;
		
		Teacher teacher1 = new Teacher();
		teacher1.setResearchField("Programming");
		teacher1.setWorkStartYear(2578);
		teacher1.id = "1249900626456";
		teacher1.name = "Plao";
		teacher1.height = 188;
		
		Student student1 = new Student();
		student1.stdId  = "63410075";
		student1.gpa = 3;
		student1.id = "1249900626123";
		student1.name = "Rus";
		student1.height = 180;
		
		Alumni alumni1 = new Alumni();
		alumni1.setCareer("Pilot");
		alumni1.setSingleStratus(false);
		alumni1.id = "1249900626456";
		alumni1.name = "Kik";
		alumni1.height = 150;
		alumni1.stdId = "63410075";
		alumni1.gpa = 4;
		
		System.out.println("*Person.........");
		System.out.println("ID : "+person1.id);
		System.out.println("Name : "+person1.name);
		System.out.println("Height  :"+person1.height);
		System.out.println("*Teacher.........");
		
		System.out.println("ResearchFied :"+teacher1.getResearchField());
		System.out.println("WorkStartYear :"+teacher1.getWorkStartYear());
		System.out.println("ID :"+teacher1.id);
		System.out.println("Name : "+teacher1.name);
		System.out.println("Height : "+teacher1.height);
		System.out.println("*Alumni..........");
		
		System.out.println("ID :"+alumni1.id);
		System.out.println("Name :"+alumni1.name);
		System.out.println("Height :"+alumni1.height);
		System.out.println("Student ID:"+alumni1.stdId);
		System.out.println("GPA :"+alumni1.gpa);
		System.out.println("Career :"+alumni1.getCareer());
		System.out.println("SingleStatus :"+alumni1.isSingleStratus());
	
		
	}

}
