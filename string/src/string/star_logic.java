package string;
//Start pattern logic building.
public class star_logic {
	public static void main(String[] args) {
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==0 && j==1 ||  i==0 && j==2) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
