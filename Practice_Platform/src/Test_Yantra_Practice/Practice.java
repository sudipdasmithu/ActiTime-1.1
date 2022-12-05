package Test_Yantra_Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		int first=0, secound=1, result;
		int count=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		while(true) {
			result=first+secound;
			count++;
			if(result>=number) 
			{
				break;
			}
			first=secound;
			secound=result;
			System.out.println(count);
		}
		System.out.println("my fabino number");
		System.out.println(result);
		
		

}
}
