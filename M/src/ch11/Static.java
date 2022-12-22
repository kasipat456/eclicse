package ch11;

public class Static {

	public static void main(String[] args) {
		Count c1 = new Count();
		System.out.println("a of c1 =  "+c1.a+" b ="+Count.b);
		Count c2 = new Count();
		System.out.println("a of c2 =  "+c2.a+" b ="+Count.b);
	}

}
class Count {
	public int a = 10;
	public static int b = 5;
	public Count() {
		a++;
		b++;
	}
}