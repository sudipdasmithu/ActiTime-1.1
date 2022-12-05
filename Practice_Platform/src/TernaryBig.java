import java.util.Scanner;

public class TernaryBig {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int Big=(a>b && a>c && a>d)?
		a:(b>c && b>d)?
				b:(c>d)?
						c:d;
System.out.println(Big+"is the biggest number");
						
	}

}
