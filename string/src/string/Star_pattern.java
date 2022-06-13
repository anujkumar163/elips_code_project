package string;

public class Star_pattern {
	public static void main(String[] args)
	   {
	      int i, j, row=5, space;
	      for(i=0; i<row; i++)
	      {
	         for(space=i; space<row; space++)
	            System.out.print(" ");
	         for(j=0; j<(i+1); j++)
	            System.out.print("* ");
	         System.out.print("\n");
	      }
		      for(i=0; i<row; i++)
		      {
		         for(space=0; space<i; space++)
		            System.out.print(" ");
		         for(j=i; j<row; j++)
		            System.out.print("* ");
		         System.out.print("\n");
		      }
	   }
}
