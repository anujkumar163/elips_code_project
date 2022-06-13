package thread_java;

public class G{
	public static void main(String[] args) {
		F a1 = new F();
		a1.start();
		synchronized (a1) {
			try {
				a1.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(a1.total);
	}
}