package exceptionHandeling_java;

import java.security.DomainCombiner;

public class D{
	public void test(int age) {
		if(age<18) {
			throw new ArithmeticException("smaller age");
		}
		else {
			System.out.println("welcome sir");
		}
	}
	public static void main(String[] args) {
		D a1 = new D();
		a1.test(30);
	}
}
	