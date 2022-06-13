package exceptionHandeling_java;

public class C {
	public static void main(String[] args) {
		try {
			int[] n = {1,2,3,4};
			System.out.println(n[5]);
		}catch (Exception e) {
			System.out.println("something went rong");
		}finally {
			System.out.println("now program is complete");
		}
	}
}
