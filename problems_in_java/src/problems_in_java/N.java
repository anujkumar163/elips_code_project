package problems_in_java;

import java.util.Scanner;

public class N{
	public static void main(String[] args) {
		int i=0;
		int num=0;
		String primeNumber=" ";
		for( i=500; i<=600; i++) {
			int count=0;
			for(num=i; num>=1; num--) {
				if(i%num==0) {
					count++;
				}
			}
			if(count==2) {
				primeNumber=primeNumber+i+" ";
			}
		}
		System.out.println("prime number btw 1 to 10");
		System.out.println(primeNumber);
	}
}
