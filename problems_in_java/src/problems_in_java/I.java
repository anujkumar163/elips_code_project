package problems_in_java;
import java.util.Scanner;
//fibonacci series next number is sume of 
//previous two number.
public class I {
	public static void main(String[] args) {
		int c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number1");
		int a = scan.nextInt();
		System.out.println("enter a number2");
		int b = scan.nextInt();
		System.out.println("enter a number of element");
		int n = scan.nextInt();
		while(n>2) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			n=n-1;
		}
	}
}
