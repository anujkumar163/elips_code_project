package problems_in_java;
//reverse a string
public class C {
	public static void main(String[] args) {
		String str = "anuj kumar";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
