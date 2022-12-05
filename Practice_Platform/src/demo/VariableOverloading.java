package demo;

public class VariableOverloading {
	String name;
	int age;
	String gender;
	double weight;
	VariableOverloading(String name, int age, double weight)
	{
		this.weight=weight;
		this.name=name;
		this.age=age;
	}
	VariableOverloading(String name, String gender, double weight)
	{
		this.name=name;
		this.gender=gender;
		this.weight=weight;
	}
	VariableOverloading()
	{
		
	}
	
	 void print()
	{
		System.out.println(name +" is a person");
		System.out.println(age +" of a person");
		System.out.println(gender +" is  person");
		System.out.println(weight +" kg of  person");
	}

	public static void main(String[] args) {
		VariableOverloading vo=new VariableOverloading("sudip","male",65.2d);
		vo.print();
		System.out.println();
		VariableOverloading vo1=new VariableOverloading();
		vo1.print();

	}

}
