package exception;
//throws
import java.io.FileWriter;
public class D {
	public static void main(String[] args) throws Exception {
		D a1 = new D();
		a1.test();
	}
	public void test() throws Exception{
		FileWriter fw = new FileWriter("D://psa//test2.txt");
	}
		
}

