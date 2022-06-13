package exception;

public class A {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			System.out.println(x);
			System.out.println(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}
}
