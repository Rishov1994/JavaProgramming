package OOPsPart1;

public class Functions_Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Functions and Methods Are Same
		
		//without creating obj, no output
		Functions_Java obj= new Functions_Java();
		//all non static methods given to obj
		
		obj.test();
		int r= obj.testA();
		System.out.println(r);
		obj.QA();
		int s= obj.division(20, 4);
		System.out.println(s);

	}
	//Non Static Methods
	public void test() {
		System.out.println("Test Method");
	}
	
	public int testA() { //Method Type is Similar To Return Type
		System.out.println("Test_A Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	public String QA() {
		System.out.println("QA Method");
		String s= "Selenium";
		
		return s;
	}
	
	public int division(int x, int y) {
		System.out.println("Division");
		int z= x/y;
		
	return z;
	}

}
