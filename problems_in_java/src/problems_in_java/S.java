package problems_in_java;
import java.util.Scanner;
//number of vowels and print vowels
public class S {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String str = scan.next();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='A' || ch=='a' || ch=='E'||ch=='e'
					||ch=='I'||ch=='i'||ch=='O'||ch=='o'
					||ch=='U'||ch=='u') {
				count=count+1;
				System.out.println(count);
				System.out.println(ch);	
			}	
		}
	}
}
