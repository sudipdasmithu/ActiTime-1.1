package Test_Yantra_Practice;

public class SumOfNumber {

	public static void main(String[] args) {
String str="Automation187";
int sum=0;
int mult=1;
for(int i=0; i<str.length(); i++) 
 {
	char ch = str.charAt(i);
	if(ch>='0'&& ch<='9') 
	{
		sum=sum+(char)(ch-48);
		mult=mult*(char)(ch-48);
	}
}
System.out.println("sum of digit "+ sum);
System.out.println("sum of digit "+ mult);

	}

}
