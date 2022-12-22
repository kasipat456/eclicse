package ch12;

public class MainExceptionHanding2 {

	public static void main(String[] args) {
		Divison ca1 = new Divison();
		try {
			System.out.println(ca1.div(5, 2));
			System.out.println(ca1.div(5, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
class Divison{
	public double div(double n1, double n2) throws Exception {
		if(n2==0) {
			throw new Exception("Divide by zero");
		}
		return n1/n2;
	}
}
	