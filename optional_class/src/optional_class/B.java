package optional_class;

import java.util.Optional;

public class B {
	int x= 10;
	static B a1 = null;
	//static B a2 = new B(); object address present
	//here return type of get method is optional class
	public static void main(String[] args) {
		Optional<B> val = Optional.ofNullable(null);
		if(val.isPresent()) {
			System.out.println("use a1");
		}else {
			System.out.println("a1 is null");
		}
	}
}
