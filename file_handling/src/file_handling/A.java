package file_handling;
import java.io.File;
import java.io.IOException;
public class A{
	public static void main(String[] args) {
		try {
			File a = new File("E:\\psa\\file4.txt");
			if(a.createNewFile()) {
				System.out.println("created"+a.getName());
			}else {
				System.out.println("already exist");
			}
		}catch(IOException e) {
			System.out.println("An error occure");
			e.printStackTrace();
		}
	}
}