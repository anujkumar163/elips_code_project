package thread_java;

public class A extends Thread{
	String name;
	A(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(this.name);
		}
	}
}