package stream_api;
//streaam api
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Even{
	public static void main(String[] args) {
		//List<Integer> number = Arrays.asList(2,3,1,7,5);
		//List<Integer> evenNumber = number.stream().filter(x->x%2==0).collect(Collectors.toList());
		//System.out.println(evenNumber);
		
		//Set<Integer> square = number.stream().map(x->x*x).collect(Collectors.toSet());
		//System.out.println(square);
		
		//List<String> name = Arrays.asList("anuj", "anuj", "abhay");
		//List<String> newName = name.stream().filter(x->x.equals("anuj")).collect(Collectors.toList());
		//System.out.println(newName);
		//System.out.println(newName.size());
		//(s->s.equalsIgnoreCase("anuj"))
		//(s->s.startsWith("s"))
		//(s->s.endWith("s"))
		//(s->s.contains("a"))
		
		List<String> name= Arrays.asList("nuj","bhay","cdd");
		List<String> newName = name.stream().sorted().collect(Collectors.toList());
		System.out.println(newName);
		
		
		
		
		
		
		
		
		
		
	}
}
