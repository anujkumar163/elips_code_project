package java_Value_reference;
// calling by value
public class L36 {
	int n  = 500;//non-stativ variable //no change//a1
	void change_data(int n) {
		n = n + 40;// change loval variable//update//a2
	}
	public static void main(String[] args) {
		L36 obj = new L36();
		System.out.println("Before caling n="+obj.n);
		obj.change_data(obj.n);//calling method value
		System.out.println("After calling n="+obj.n);
	}
}
