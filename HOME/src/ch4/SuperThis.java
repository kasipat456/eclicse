package ch4;

public class SuperThis {

	public static void main(String[] args) {
		B b = new B(1,2);
		b.print();
		
	}

}
class A{
	protected int a;
	void print() {System.out.println(a);}
}
class B extends A {
	protected int a;
	B(int x,int y){super.a=x; this.a=y; }
	void print() {
		super.print();
		System.out.println(a);
	}
}




