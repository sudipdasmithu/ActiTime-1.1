import java.util.Scanner;

public class CountPrime {
	public static int isPrime(int a) {
		int count=0;
		do {
			int d=a%10;
			if(d==1||d==3||d==5||d==7) {
				count++;
			}
			a=a/10;
		}while(a!=0);
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		 int a = sc.nextInt();
		 int rs = isPrime(a);
		 System.out.println(rs);
		

	}

}
