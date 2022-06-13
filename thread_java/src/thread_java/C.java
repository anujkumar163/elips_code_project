package thread_java;

public class C implements Runnable{
	String name;
	C(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(this.name);
		}
	}
	public static void main(String[] args) {
		C a1 = new C("anuj");
		Thread t1 = new Thread(a1);
		t1.start();
		C a2 = new C("abhay");
		Thread t2 = new Thread(a2);
		t2.start();
		for(int i=0; i<100; i++) {
			System.out.println("main");
		}
	}
}