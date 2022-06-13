package problems_in_java;
//in string find upper, lower, special and number
import java.util.Scanner;
public class T {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		int upper=0, lower=0, number=0, special=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				upper++;
			}
			else if(ch>='a'&& ch<='z'){
				lower++;
			}
			else if(ch>='0'&& ch<='9') {
				number++;
			}
			else {
				special++;
			}
		}
		System.out.println("uper case::"+upper);
		System.out.println("lower case::"+lower);
		System.out.println("number case::"+number);
		System.out.println("special case::"+special);
	}
}
