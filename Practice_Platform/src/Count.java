import java.util.Scanner;

public class Count {
	public static int isCount(int a) {
		int count=0;
		do{
			count++;
			a=a/10;
			
		}while(a!=0);
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Number");
int a = sc.nextInt();
int rs = isCount(a);
System.out.println(rs);
		

	}

}
