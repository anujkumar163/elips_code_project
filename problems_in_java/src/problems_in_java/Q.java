package problems_in_java;
import java.util.Scanner;
public class Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scan.nextInt();
		int count=0;
		for(int i=0; i<a; i++) {
			if(a%2==0) {
				count++;
			}
			}
		if(count>1) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}
}
