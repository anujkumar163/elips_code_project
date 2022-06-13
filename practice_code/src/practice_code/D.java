package practice_code;

public class D{
	public static void main(String[] args) {
	int a[] = {8,5,3,6,8,9,9,2,1};
	int temp;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a.length-1; j++) {
			if(a[j]>a[j+1]) {
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int z: a) {
		System.out.print(" "+ z);			
	}
	int temp1[]= new int[a.length];
	int j=0;
	for(int i=0; i<a.length-1; i++) {
		if(a[i]!=a[i+1]) {
			temp1[j] = a[i];
			j++;				
		}
	}
	temp1[j] = a[a.length-1];
	for(int m: temp1) {
		System.out.println();
		System.out.println(m);
	}
	}
}