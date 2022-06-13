package mysql_3;
import java.util.StringTokenizer;
public class Ato {
	public static void main(String[] args) {
		int count=0;
		StringTokenizer str = new StringTokenizer("anuj sir academey");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			count++;
		}
		System.out.println(count++);
	}
	
}
