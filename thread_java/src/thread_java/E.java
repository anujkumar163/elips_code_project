package thread_java;

public class E {
	int balance = 0;
	public static void main(String[] args) {
		E a1= new E();
		a1.account();
		System.out.println(a1.balance);
	}
	public void account() {
		Thread t1 = new Thread( new Runnable(){
			@Override
			public void run() {
				add();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				sub();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e){
			System.out.println(e);
			
		}
		
	}
	public synchronized void add() {
		for(int i=0; i<1000; i++) {
			balance = balance+1;

		}
	}
	public synchronized void sub() {
		for(int i=0; i<1000; i++) {
			balance = balance-1;
		}
	}
}
