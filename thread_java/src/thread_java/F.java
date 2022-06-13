package thread_java;
//wait synchronized
public class F extends Thread{
	int total = 0;
	public synchronized void run() {
		for(int i=0; i<1000; i++) {
			total =total+1;
		}
		notify();
	}
}