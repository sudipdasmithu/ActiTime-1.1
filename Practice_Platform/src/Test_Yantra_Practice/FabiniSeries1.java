package Test_Yantra_Practice;

public class FabiniSeries1 {

	public static void main( String [] args) 
	{
		
		int a1=0;
		int a2=1;
		int a3;
		int num=0;
		while(num<10) 
		{
			a3=a1+a2;
			num++;
			a1=a2;
			a2=a3;
			System.out.println(num);
			
			
		}
		
		
		

}
}
