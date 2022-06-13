package app_java_1;

public class D {
	D(){
		System.out.println(1);//1
	}
	D(int x){
		System.out.println(x);//100
	}
	D(int x, int y){
		System.out.println(x);//1000,2000
		System.out.println(y);
	}
	public static void main(String[] args) {
		D a1 = new D();
		D a2 = new D(100);
		D a3 = new D(1000, 2000);
	}
}
