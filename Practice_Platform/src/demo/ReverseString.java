package demo;

public class ReverseString {

	public static void main(String[] args) {
//My Name Is Sudip= yM emaN sI piduS
		String str="Hello World";
	 String[] text = str.split(" ");
	String text1 = "";
	for(int i=text.length-1; i>=0; i--) {
		    String ar = text[i];
		    String arr = "";
		    for(int j=0; j<ar.length(); j++) {
		    	arr=arr+ar.charAt(j);
		    }
		   text1= text1+arr+" ";
	}
	System.out.println(text1);
	      			 
	}

}
