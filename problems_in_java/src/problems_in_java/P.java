package problems_in_java;
import java.util.Scanner;
//fibonacci series  next number is the sum 
//of previous two number;
public class P {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a = scan.nextInt();
		System.out.println("enter second mumber");
		int b = scan.nextInt();
		System.out.println("enter the number of element");
		int count = scan.nextInt();
		System.out.println(a+" "+b);
		int c;
		for(int i=0; i<count-2; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
