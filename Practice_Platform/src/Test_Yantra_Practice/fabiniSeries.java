package Test_Yantra_Practice;
import java.util.Scanner;

public class fabiniSeries {

	public static void main(String[] args) {
int firstno=0;  int secoundno=1, result;
int count=0; //1
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number");
int Actno = sc.nextInt(); //10
while(true) 
{
	result= firstno+secoundno; //1,2,3,5,8,13,21,34
	count++; //5

if(result>=Actno) // 1 10
{
	break;
}
firstno=secoundno; //5
secoundno=result; //8
System.out.println(count); //5



	}
System.out.println("i am result of fabino");
System.out.println(result);

}
}
