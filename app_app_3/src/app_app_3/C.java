package app_app_3;

public class C extends A{
	public void test3() {
		System.out.println("C class");
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		c1.test3();
	}
}
