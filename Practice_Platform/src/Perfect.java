import java.util.Scanner;

public class Perfect {
	public boolean getPerfect(int x)
	{
		int per=0; int j=x/2;
		while(j>=1)
		{
			per=per+j;
			j--;
		}
		if(per==x)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		Perfect p=new Perfect();
		boolean rs=p.getPerfect(x);
		if (rs==true)
			System.out.println(x+"is a perfect");
		else
		{
			System.out.println(x+" is a false");
		}
		

	}

}
