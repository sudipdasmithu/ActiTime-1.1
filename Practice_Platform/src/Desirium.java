import java.util.Scanner;

public class Desirium {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter Deserium Number");
int k=sc.nextInt();
boolean rs=isDiserium(k);
   if(rs==true)
System.out.println(k+" is a Desirium number");
else
	System.out.println(k+"is not a Desirium number");
	}
public static boolean isDiserium(int x)
{
	int temp=x, sum=0, dc=isCount(x);
	do {
		int d=x%10;
		sum=sum+pow(d,dc);
		dc--;
		x=x/10;
	}while(x!=0);
	return temp==sum;
	}
public static int isCount(int a)
{
	int count=0;
	do {
		count++;
		a=a/10;
	}while(a!=0);
	return count;
	
}
public static int pow(int n, int p)
{
	int pw=1;
	do {
		pw=pw*n;
		p--;
	}while(p>0);
	return pw;
}
}
