package file_handling;

public class C{
	public static void main(String[] args) {
	int a[] = {1,3,2,5,6,3,2,1};
	int temp;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a.length-1; j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[i] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	for(int i: a){
		System.out.println(i);
	}
	}
}