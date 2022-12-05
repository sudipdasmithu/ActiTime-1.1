import java.util.Scanner;

public class Strong$Number {
	public static int getFact(int x) {
		int fact=1;
		while(x>1)
		{
			fact*=x;
			x--;
			
		}
		return fact;
	}
	static boolean isStrong(int n)
	{
		int temp=0, sum=n;
		do {
			int d=n%10;
			temp+=getFact(d);
			n=n/10;
		}while(n!=0);
	return sum==temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		boolean rs=isStrong(a);
		if(rs==true)
		System.out.println("is a Strong number");
		else
			System.out.println("is a  not Strong number");
			
		

	}

}
