package p2;

import java.util.Scanner;

//problem
public class A {
	//method sum
	public static int sum(int n) {
		int sum=0;
		while(n>0) {
			int rem = n%10;// last value
			sum = sum+rem;
			n= n/10; // remaining value
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter l, r, k");
		int l = scan.nextInt();
		int r = scan.nextInt();
		int k = scan.nextInt();
		int count = 0;
		for(int i=l; i<=r; i++) {
			if(sum(i)%k==0) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
