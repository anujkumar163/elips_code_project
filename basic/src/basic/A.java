package basic;

public class A {//parent
	public void test() {
		System.out.println(100);
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
	}
}
