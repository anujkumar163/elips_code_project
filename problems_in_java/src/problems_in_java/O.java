package problems_in_java;
import java.util.Scanner;
public class O {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a numbers");
		int n = scan.nextInt();
		int count=0;
		while(n>0) {
			count=count+1;
			n=n/10;
		}
		System.out.println(count);
	}
}
