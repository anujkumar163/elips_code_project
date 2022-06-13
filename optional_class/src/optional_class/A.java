package optional_class;

public class A {
	int x=10;
	static A a1 = null; //null reference
	//when you call non-static variable with null reference
	//variable you will get null pointer exception;
	public static void main(String[] args) {
		try {
			System.out.println(a1.x);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(100);
	}
}
