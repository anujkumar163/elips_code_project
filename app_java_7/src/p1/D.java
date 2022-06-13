package p1;

public class D implements C{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(1);
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println(3);
	}
	public static void main(String[] args) {
		D d2 = new D();
		d2.test1();
		d2.test2();
		d2.test3();
	}
}