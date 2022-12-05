package Test_Yantra_Practice;

public class CommonNumber {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {20,15,90,71};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
