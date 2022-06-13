package thread_java;
//thread priority it decide which thread is going to run first and which thread will run later.
//if we set the priority then it is the request made to the thread schedular where their is no acuraty that it will be processed or approved.
//the minimum thread priority is one and max. thread is 10 and the normal thread thread prioroty is five. who ever we can set the thread priority with a number any thing between  1 to 110; example 
public class I extends Thread{
	String name;
	I(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		I a1 = new I("anuj");
		I a2 = new I("abhay");
		a1.setPriority(10);
		a2.setPriority(1);
		a1.setName("addamount");
		a2.setName("withdraw");
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		a1.start();
		a2.start();
	}
	public void run() {
		System.out.println(this.name);
	}
}
