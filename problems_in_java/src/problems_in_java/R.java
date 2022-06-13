package problems_in_java;
import java.util.Scanner;
// amstrong number=153,407,370
//1^3+5^3+3^3=153
public class R {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scan.nextInt();
		int z,count=0,digit, sum=0;
		z=a;
		while(z>0) {
			count=count+1;
			z=z/10;
		}
		System.out.println("count of digit::"+count);
		z=a;
		while(z>0) {
			digit=z%10;
			sum+=(Math.pow(digit, count));
			z=z/10;
		}
		if(sum==a) {
			System.out.println("amstrong number::"+a);
		}else {
			System.out.println("not amstrong number:;"+a);
		}
		
	}
}
