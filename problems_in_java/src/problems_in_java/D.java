package problems_in_java;
// is string is palidrom or not
public class D {
	public static void main(String[] args) {
		String str = "radar", reverseStr = "";
	    
	    //int strLength = str.length();

	    for (int i = str.length() - 1; i >=0; i--) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
		
	}
}
