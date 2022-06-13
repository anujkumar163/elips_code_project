package string;

public class Duplicate {
	public static void main(String[] args) {
		String str = "madam";
		int length = str.length();
		char[] ch = str.toCharArray();
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate "+ ch[j]);
					break;
				}
			}
		}
	}
}
