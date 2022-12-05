package StringToCharArray;

import java.util.Arrays;

import java.util.stream.Collectors;

public class StringArrayToString {

	public static void main(String[] args) {
String[] array= {"T",    "R",  "Y"};   //T;R;Y
String text = String.join("|", array); //convert String Array to String
System.out.println(text);


text=Arrays.asList("t","r","y","i","n","g").stream().collect(Collectors.joining("|"));
System.out.println(text);
	}
}
