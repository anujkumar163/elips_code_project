package string;

import java.util.Arrays;
//immutable class
public final class A {
	
	private  int id;
	private  String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.id=1;
		a1.name="anuj";
		System.out.println(a1.id);
		System.out.println(a1.name);
	}
}
 