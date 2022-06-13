package java_Value_reference;
//calling by reference=memory address
public class L37 {
	int n = 500;
	void change_data(L37 obj) {
		obj.n = obj.n + 40;//local variable
	}
	public static void main(String[] args) {
		L37 obj = new L37();
		System.out.println("Before calling n"+ obj.n);
		obj.change_data(obj);//rference calling
		System.out.println("after calling n ="+ obj.n);
	}
}
