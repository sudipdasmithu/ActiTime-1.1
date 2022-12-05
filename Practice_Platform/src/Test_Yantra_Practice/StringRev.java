package Test_Yantra_Practice;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
System.out.println("Enter a string");
String str = sc.nextLine();
String st = "";
for(int i=str.length()-1; i>=0; i--) {
	st=st+str.charAt(i);
}
System.out.println(st);

	}

}
