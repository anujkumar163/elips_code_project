package anuj;

public class Mloading{
	static int plus(int x, int y) {
		return x + y;
	}
	static double plus(double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		int myNum1 = plus(8,5);
		double myNum2 = plus(4.3, 6.26);
		System.out.println("int"+ myNum1);
		System.out.println("double"+myNum2);
	}
}