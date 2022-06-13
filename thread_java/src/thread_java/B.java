package thread_java;

public class B {
	public static void main(String[] args) {
		A a1=new A("aaa");
		A a2=new A("bbb");
		A a3=new A("ccc");
		a1.start();
		a2.start();
		a3.start();
	}
}
