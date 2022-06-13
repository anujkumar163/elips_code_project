package problems_in_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AA {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> evenNumber = number.stream().filter
				(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumber);
	}
}
