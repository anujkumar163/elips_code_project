package problems_in_java;
//swaping of two number;
public class L {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		System.out.println(a+"::before swaping::"+b);
		a=a+b;//5+7=12
		b=a-b;//12-7=5
		a=a-b;//12-5=7
		System.out.println(a+":;after swaping::"+b);
	}
}
