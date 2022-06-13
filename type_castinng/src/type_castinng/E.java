package type_castinng;

public class E {
	public static void main(String[] args) {
		float f = 10.3f;
		long l = (long) f;
		System.out.println(l);//data lost happend here
	}
}
