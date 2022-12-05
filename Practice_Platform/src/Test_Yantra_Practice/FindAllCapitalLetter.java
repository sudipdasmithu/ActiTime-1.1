package Test_Yantra_Practice;

public class FindAllCapitalLetter {

	public static void main(String[] args) {
		
		 String st="Test@Yant@RA";
		 char str1=0;
		 for(int i=0; i<st.length(); i++) 
		 {
			 char ch = st.charAt(i);
			 if(ch>='A' && ch<='Z') {
				 str1=ch; 
				 System.out.println(str1);
			 }
			 }
		 }
		 

	}


