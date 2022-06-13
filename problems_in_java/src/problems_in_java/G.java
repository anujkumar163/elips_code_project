package problems_in_java;
import java.util.Scanner;
//find the maximum value in array;
public class G {
	public static void main(String[] args) {
		int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
	//second and sort method 
//	int max;
//	int a[] = {1,25,3,20};
//	//int n[] = new int[a.length];
//	max = a[0];
//	for(int i = 0; i < a.length; i++)
//    {
//        if(max < a[i])
//        {
//            max = a[i];
//        }
//    }
//	System.out.println("Maximum value:"+max);


}

