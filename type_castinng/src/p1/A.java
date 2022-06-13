package p1;
//class upcasting
public class A {
	public static void main(String[] args) {
		A a1 = new B();
		System.out.println(a1);
		a1 = new C();
		System.out.println(a1);
	}
}
