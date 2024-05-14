package OOPsPart1;

public class Car {
	
	//Create Class Variables
	
	String model;
	int manyear;
	Boolean bol;

	public static void main(String[] args) {
		
	//Create Object Of Car Class
		
	Car a= new Car(); //new Car is the Object of Car class, a,b,c is obj reference variables
	Car b= new Car();
	Car c =new Car();
	
	a.model= "BMW";
	a.manyear= 2016;
	a.bol= true;
	
	b.model= "Audi";
	b.manyear= 2018;
	b.bol= true;
	
	c.model= "Skoda";
	c.manyear= 2022;
	c.bol= false;
	
	System.out.println("Before Shifting Ref");
	System.out.println(a.model);
	System.out.println(b.manyear);
	System.out.println("The Model Is Electric:"+c.bol);
	
	System.out.println("After Shifting Ref");
	a=c;
	System.out.println(a.model);

	}

}
