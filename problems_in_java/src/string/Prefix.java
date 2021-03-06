package string;

public class Prefix {
	public static String findLongestString(String[] strs) {
		if(strs == null || strs.length==0) {
		return "";
	}
	String lcp = strs[0];
	for(int i=1; i<strs.length; i++) {
		String currentWord = strs[i];
		int j=0;
		while(j<currentWord.length() && j< lcp.length() && 
				currentWord.charAt(j)==lcp.charAt(j)) {
			j++;
		}
		if(j==0) 
			return "";
			lcp = currentWord.substring(0,j);
		}
		return lcp;
	}
	public static void main(String[] args) {
		String[] strgs = {"rast", "rasbat", "rasghf"};
		String result = findLongestString(strgs);
		System.out.println(result);
	}
}
