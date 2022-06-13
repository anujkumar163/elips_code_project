package stream_api;

import java.util.Arrays;
import java.util.List;

public class NumberStmApi {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,6,5,4);
		//number.stream().map(x->x*x).forEach(y->System.out.println(y));
		Integer var = number.stream().max(Integer::compare).get();
		Integer var2 = number.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(var);
		System.out.println(var2);
	}
}
