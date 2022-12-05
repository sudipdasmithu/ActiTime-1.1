package Test_Yantra_Practice;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number");
int a = sc.nextInt();
int temp = a;
int rev=0;
do {
	int d= a%10;
	rev=rev*10+d;
	a=a/10;
}
while(a!=0);

System.out.println(rev);
if(rev==temp) 
{
	System.out.println("its a palimdrome number");

}
else
	System.out.println("Not a palimdrome");

	}

}
