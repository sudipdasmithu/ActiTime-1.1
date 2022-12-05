package StringToCharArray;

public class ReverseTwoString {

	public static void main(String[] args) {
String str="Sudip Das";
String[] words=str.split(" ");
String reve="";

for(int i=words.length-1; i>=0; i--) {
	String word = words[i];
	String revstring = "";
	
	for(int j=0; j<word.length(); j++) 
	{
		revstring=revstring+word.charAt(j);
	}
	reve=reve+revstring+" ";
    }
System.out.println(reve);
	}

}

