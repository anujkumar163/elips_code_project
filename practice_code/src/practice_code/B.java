package practice_code;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class B{
	public static void main(String[] args) {
		try {
			FileInputStream fos = new FileInputStream("D:\\psa\\test2.txt");
			ObjectInputStream oos = new ObjectInputStream(fos);
			A a1 = (A) oos.readObject();
			System.out.println(a1.id);
			System.out.println(a1.name);
			System.out.println(a1.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}