package app_java_1;

public class Ret {
	public static void main(String[] args) {
		Ret a1 = new Ret();
		a1.test(10,20,30,40);
	}
	public void test(int...x) {
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		
	}
}
