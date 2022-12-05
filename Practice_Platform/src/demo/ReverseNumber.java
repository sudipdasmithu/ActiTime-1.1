package demo;

import java.util.Scanner;

public class ReverseNumber {
	public static int getRev(int n)
	{
	int rev=0;
	{
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		return rev;
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int rs=getRev(a);
		
			System.out.println(rs+"is  reverse number");
		}

	}


