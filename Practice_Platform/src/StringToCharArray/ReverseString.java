package StringToCharArray;

public class ReverseString {

	public static void main(String[] args) {
String s="sudip";
String rev="";
int size = s.length();
for(int i=size-1; i>=0; i--) {
	rev = rev+s.charAt(i);
 }
System.out.println(rev);

	}

}
