package StringToCharArray;

public class Reverse {

	public static void main(String[] args) {
		String str="Sudip is a good Boy";
		    String[] words = str.split("  ");
		    String space="";
		    for(int i=0; i<words.length;i++) {
		    	 String word = words[i];
		    	 String space1="";
		    	 for(int j=word.length()-1; j>=0; j--) {
		    		space1= space1+word.charAt(j);
		    	 }
		    	 space=space+space1+" ";
		    	 System.out.println(space);
		    			 
		    }
				

	}

}
