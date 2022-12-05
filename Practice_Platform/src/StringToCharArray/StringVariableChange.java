package StringToCharArray;

public class StringVariableChange {

	public static void main(String[] args) {
        String s1 = "Sudip";
        String s2="Nagraj";
        System.out.println(s1+" "+s2);
        String s=s1+s2;
        s2=s1;
        System.out.println(s2);
        s1= s.substring(s1.length());
        System.out.println(s1+" "+s2);
        
	}

}