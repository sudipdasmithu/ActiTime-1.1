package demo;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean getPer(int n)
	{
		int sum=0; 
		for(int i=1; i<=n/2; i++)
		{
			if(n%2==0)
				sum = sum+i;
		}
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		Object getPer;
		boolean rs=getPer(a);
		if(rs==true)
		{
			System.out.println(a+" is a Perfect number");
		}
		else {
			System.out.println(a+" is not a perfect number");
		}
	}
}

