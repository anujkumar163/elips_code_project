package file_handling;
import java.io.FileWriter;
import java.io.IOException;
public class B {
	public static void main(String[] args) {
		try {
			FileWriter myObj=new FileWriter("E:\\psa\\file1.txt");
			myObj.write("hello world");
			myObj.close();
		} catch (IOException e) {
			System.out.println("an error occure");
			e.printStackTrace();
		}
	}
}
