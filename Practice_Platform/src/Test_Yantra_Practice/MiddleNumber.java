package Test_Yantra_Practice;

public class MiddleNumber {

	public static void main(String[] args) {
int num[]= {12,23,54,65,89,90,78,90};
int numb=0;
for(int i=0; i<=num.length/2; i++) { 
	
	for(int j=i+1;j<num.length;j++)
	{
		if(num[i]>num[j]) {
			numb=num[i];
			num[i]=num[j];
			num[j]=numb;
			System.out.println(numb);
			
			
			
		}
	}
}
	}

}
