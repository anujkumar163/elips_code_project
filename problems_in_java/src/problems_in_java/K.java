package problems_in_java;
import java.util.Iterator;
//hcf and lcm
public class K {
	public static void main(String[] args) {
	int a=12;
	int b=24;
	int hcf=0;
	for(int i=1; i<=a && i<=b; i++) {
		if(a%i==0 && b%i==0) {
			hcf=i;
			
		}
	}
	System.out.println(hcf);
	//lcm*hcf=a*b
	int lcm=(a*b)/hcf;
	System.out.println("lcm of a and b::"+lcm);
	}
}
