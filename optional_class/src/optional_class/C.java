package optional_class;

import java.util.ArrayList;
import java.util.List;

public class C {
	public static void main(String[] args) {
		List<String>countryName = new ArrayList<String>();
		countryName.add("india");
		countryName.add("anuj");
		countryName.add("south africa");
		countryName.forEach(x -> System.out.println(x));
	}
}
