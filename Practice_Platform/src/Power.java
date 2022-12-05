import java.util.Scanner;

public class Power {
	public static int isPower(int n,int p) {
		int po=1;
		while(p>0) {
			po=po*n;
			p--;
		}
		return po;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Power number");
		int p = sc.nextInt();
		int n= sc.nextInt();
		int rs = isPower(n,p);
		System.out.println(rs);//2*2=4*2=8

	}

}
