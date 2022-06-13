package optionalClass;

import java.util.Optional;

// optional class
public class A {
	int x = 10;
	static A a1 = null;
	public static void main(String[] args) {
		Optional<A> val = Optional.ofNullable(a1);
		if(val.isPresent()) {
			System.out.println("use a1");
		}else {
			System.out.println("a1 is null");
		}
	}
}
