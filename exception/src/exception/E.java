package exception;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		int balance = 500;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = scan.nextInt();
		if(balance>amount) {
			System.out.println("please collect");
		}else {
			try {
				throw new InsufficientFunds();
			} catch (InsufficientFunds e) {
				System.out.println(e);
				System.out.println("not enough case");
			}
		}
	}
}
