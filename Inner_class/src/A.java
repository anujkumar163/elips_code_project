
class OuterClass{
	int x =10;
	
	static class InnerClass{
		int y =10;
	}
}
public class A{
	public static void main(String[] args) {
		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		System.out.println(myInner.y);
	}
}