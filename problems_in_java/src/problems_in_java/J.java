package problems_in_java;
import java.util.Iterator;
//factorial of a number
public class J {
	public static void main(String[] args) {
		int a =3;
		long factorial = 1;
		for(int i=1; i<=3; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
