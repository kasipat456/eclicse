package overloading;

public class Sum {
	public int add(int num1, int num2) {
		System.out.print("Method one: ");
		return num1+num2;
	}
	public float add(float num1, float num2) {
		System.out.print("Method two: ");
		return num1+num2;
	}
	public int add(int num1, int num2, int num3) {
		System.out.print("Method three: ");
		return num1+num2+num3;
	}
	public float add(float num1, float num2, float num3, float num4) {
		System.out.print("Method four: ");
		return num1+num2+num3+num4;
	}
	public double add(double num1, double num2, double num3,double num4, double num5) {
		System.out.print("Method five: ");
		return num1+num2+num3+num4+num5;
	}
}



