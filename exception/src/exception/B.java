package exception;
//public Format expresion
//int -> sring
public class B {
	public static void main(String[] args) {
		String x = "10";
		int y = Integer.parseInt(x);
		System.out.println(y);
		String z = "10.3";
		float f = Float.parseFloat(z);
		System.out.println(f);
		String x1 = "true";
		boolean x2 = Boolean.parseBoolean(x1);
		System.out.println(x2);
	}
}
