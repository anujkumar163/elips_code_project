package app_java_1;

public class Locl{
	static Locl c1;
	public static void main(String[] args) {
		c1 = new Locl();
		System.out.println(c1);
		c1.test();
	}
	public void test() {
		System.out.println(c1);
	}
}
