package Test_Yantra_Practice;

public class CapitlAplha {

	public static void main(String[] args) {
    String str="Sudip Das";
    char ch;
    for (int i = 0; i < str.length(); i++) {
    	char ch1 = str.charAt(i);
    	if(ch1>='A' && ch1<='Z') {
    		ch=ch1;
    		System.out.print(ch);
    	}
		
	}

	}   

}
