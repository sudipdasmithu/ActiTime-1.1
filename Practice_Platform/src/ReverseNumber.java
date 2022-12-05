import java.util.Scanner;

public class ReverseNumber {
	public static int isReverse(int a) {
		int rev=0;
		do {
			int d=a%10;
			rev=rev*10+d;
			a=a/10;
		}while(a!=0);
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		   int a = sc.nextInt();
		int rs = isReverse(a);
		System.out.println("reverse number is"+ rs);
		

	}

}
