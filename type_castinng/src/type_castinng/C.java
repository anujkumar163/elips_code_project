package type_castinng;
//no auto upcating bec. loss of .3 value
public class C {
	public static void main(String[] args) {
		float f = 10.3f;
		long l = f;//not a decimal value
		System.out.println(f);
	}
}
