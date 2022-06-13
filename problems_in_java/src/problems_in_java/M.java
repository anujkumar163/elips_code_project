package problems_in_java;
//swaping of number second method
public class M {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c;
		System.out.println(a+"::before swaping::"+b);
		c=a;
		a=b;//a=7
		b=c;//b=5
		
		System.out.println(a+"::after swaping::"+b);
	}
}
