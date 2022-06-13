package problems_in_java;
import java.util.Scanner;
// leap year 2000,2008,1988
public class F {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number::=>");
		int year = scan.nextInt();
		if(year%400==0) {
			System.out.println("leap year");
		}else if (year%4==0){
			System.out.println("leap year");
		}else if(year%100==0) {
			System.out.println("not a leap year");
		}else {
			System.out.println("not a leap year");
		}
	}
}
