package StringToCharArray;



public class Practice {

	public static void main(String[] args) 
	{
		String s= "Hello World";
		String[] text = s.split(" ");
		String reve = "";
		for(int i=text.length-1; i>=0; i--) {
			String ar = text[i];
			System.out.println(ar);
			String revestr = "";
			for(int j=0; j<=ar.length()-1; j++) {
				revestr=revestr+ar.charAt(j);
			}
			reve=reve+revestr+" ";
		}
		System.out.println(reve);

	}

}
