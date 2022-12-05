import java.util.Scanner;

public class ArmStrong {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ArmStrong number");
		int a=sc.nextInt();
		boolean rs=isStrong(a);
		if(rs==true)
			System.out.println(a+" is a Arm Strong number");
		else
			System.out.println(a+" is not a Arm Strong Number");
	}

	static boolean isStrong(int x)
	{
		int sum=0, tem=x;
		int dc=countdigit(x);
		do {
			int d=x%10;
			sum+=pow(d,dc);
			x=x/10;
		}
		while(x!=0);
		return sum==tem;
	}
	static int countdigit(int n)
	{
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
		
	}
	static int pow(int a,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*a;
			p--;
		}
		return pw;
	}
		

}




