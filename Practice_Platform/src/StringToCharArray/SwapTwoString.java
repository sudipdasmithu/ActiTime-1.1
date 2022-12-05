package StringToCharArray;

public class SwapTwoString {

	public static void main(String[] args) {
String s1="Hello";
String s2="Sudip";
 String s = s1+s2;
 System.out.println(s);// before swapping
 s2=s.substring(0, s.length()-s2.length());//swapping s1 to s2
 s1=s.substring(s1.length());//swapping s2 to s1
 System.out.println(s2+s1);// after swapping
	}

}
