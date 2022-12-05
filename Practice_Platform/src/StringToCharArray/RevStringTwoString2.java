package StringToCharArray;

public class RevStringTwoString2 {

	public static void main(String[] args) {
String s="i am the best and happy";
String[] ar = s.split(" ");
String word = "";
for(int i=0; i<ar.length; i++) {
	String arr = ar[i];
	String words = "";
	 for(int j=0; j<=arr.length()-1;j++) {
		 words=words+arr.charAt(j);
	 }
	 word=word+words+" ";
}
System.out.println(word);
	}

}
