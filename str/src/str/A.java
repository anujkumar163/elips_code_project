package str;
//imutable
final public class A {
	private final int age;
	private final String name;
	public A(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		A a1 = new A(20, "anuj");
	}
}
