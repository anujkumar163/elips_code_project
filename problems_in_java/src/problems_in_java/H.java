package problems_in_java;
import java.util.Scanner;
//prime number;
//use second method not this
public class H {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println("not a prime no");
				break;
			}else if(num==0 || num ==1){
				System.out.println("not a prime no");
				break;
			}else {
				System.out.println("prime number");
				break;
			}
		}
	}
}
