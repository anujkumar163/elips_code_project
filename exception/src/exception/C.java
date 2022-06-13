package exception;

public class C{
	public static void main(String[] args) {
		try {
			String x = "abjdjd";
			int y = Integer.parseInt(x);
			System.out.println(y);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		System.out.println(100);
	}
}