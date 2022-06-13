package string;
// no of words in string and print that words.
public class B {
	public static void main(String[] args) {
		String str = " Anuj kumar patel ";
		String[] s = str.trim().split(" ");
		System.out.println(s.length);
		for (String x: s) {
			System.out.println(x);
		}
	}
}
