package Test_Yantra_Practice;

import java.util.Scanner;

public class ReverseStringByArray {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a String");
String str = sc.nextLine(); //sudip   pidus
char[] ar = str.toCharArray();//[s u d i p]
int i=0, j=ar.length-1;
char temp = 0;
while(i<j) {
	 temp = ar[i];//p
	ar[i]=ar[j]; //s
	ar[j]=temp;//p
	i++;
	j--;
	
	
}
String s= new String(ar);
System.out.println(s);
/*System.out.println(temp);
char a[]=new char[ar.length-1];
for(int i=ar.length-1; i>=0; i--) {
	
	
	
}
System.out.println(a[i]);*/
	}

}
