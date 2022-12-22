package ch12;

public class MainExceptionHanding {

	public static void main(String[] args) {
		Division cal = new Division();
		System.out.println(cal.div(5, 2));
		System.out.println(cal.div(5, 0));
	}

}
class Division{
	public double div(double n1, double n2) {
		return n1/n2;
	}
}
		