package demo;

public class SwapVariable {

	public static void main(String[] args) {
String s1="Sudip";
String s2="Pinky";
String s=s1+s2;
System.out.println(s);
s2=s.substring(0,s.length()-s2.length());
s1=s.substring(s2.length());

System.out.println(s1+""+s2);

	}

}
