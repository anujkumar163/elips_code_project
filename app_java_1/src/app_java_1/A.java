package app_java_1;

import java.util.Scanner;

public class A{
	public static void main(String[] args) {
		int max;
		int a[] = {1,25,3,20};
		//int n[] = new int[a.length];
		max = a[0];
		for(int i = 0; i < a.length; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
		System.out.println("Maximum value:"+max);
    }
}
