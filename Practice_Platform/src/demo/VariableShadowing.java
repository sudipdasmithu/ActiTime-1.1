package demo;

public class VariableShadowing {
	double price;
	 String brand;
	String colour;
	VariableShadowing(String brand, double price,String colour)
	{
		
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	}
	public  void details()
	{
		System.out.println(colour+"is used for writting");
		System.out.println( brand+"is use for good griping and smooth writing");
        System.out.println(price+"is less");

	
	}

	public static void main(String[] args) {
		VariableShadowing vs=new VariableShadowing("cello",20.50d,"Black");
		vs.details();

	}

}
