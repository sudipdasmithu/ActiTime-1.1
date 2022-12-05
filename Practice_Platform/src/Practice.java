import java.util.Scanner;

public class Practice {
	public static boolean isGet(int x)
	{
		int sum=0; int tem=x;
		int dc=isCount(x);
				do {
					int d=x%10;
					sum=sum+isPower(dc,d);
					x=x/10;
				}
				while (x!=0);
		return sum==tem;
	}
	public static int isPower(int n, int p)
	{
		int po=1;
		while(p>0)
		{
			po=po+n;
			p--;
		}
		return po;
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
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		boolean rs=isGet(a);
		if (rs==true)
			System.out.println(a+"is a Arm strong number");
		else
		    System.out.println(a+"is not a Arm strong number");
	}

}
