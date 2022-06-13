package thread_java;

public class H extends Thread{
	public static void main(String[] args) {
		H a1 = new H();
		System.out.println(a1.getState());
		a1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(a1.getState());
	}
	public void run() {
		System.out.println("Test2");
	}
}