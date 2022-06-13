package practice;

import java.nio.file.attribute.AclEntry;

public class A extends Thread{
	String name;
	A(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		A a1 = new A("anuj");
		A a2 = new A("abhay");
		a1.setName("kallla");
		a2.setName("gora");
		
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		a1.start();
		a2.start();
		
	}
	public void run() {
		System.out.println(this.name);
	}
}