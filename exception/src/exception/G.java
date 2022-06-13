package exception;

public class G {
	int x = 1000;
	public static void main(String[] args) {
		G a1 = null;
		try {
			//System.out.println(a1.x);
			Integer.parseInt("anhgug");
		} catch (ArithmeticException e) {
			System.out.println(1);
		}catch(NullPointerException e){
			System.out.println(2);
		}catch(Exception e){
			System.out.println(3);
		}catch(Throwable e) {
			System.out.println(4);
		}
	}
}
