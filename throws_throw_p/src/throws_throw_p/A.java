package throws_throw_p;
import java.io.FileWriter;
public class A {
	public static void main(String[] args) {
		try {
			int x=10;
			int y=0;
			int z=x/y;
			System.out.println(z);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("last method");
		}
		
	}
}