package Test_Yantra_Practice;

import java.util.Scanner;

public class ReverseArrayNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a arrayNumber");
		int n = sc.nextInt();
		int a[]= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int i=0, j=a.length-1;
		
		while(i<j) {
			int temp = a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
		}
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
		
		
		 
		
	}

}
