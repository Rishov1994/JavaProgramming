package OOPsPart1;

public class WrapperClass {

	public static void main(String[] args) {
		// Store int value as String
		String x= "100";
		System.out.println(x+20);
		//Convert String to Int using Wrapper Class
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		//Integer, Double, Boolean various Wrapper Class
		double d=Double.parseDouble(x);
		System.out.println(d+12.345);
		
		//Convert To String
		String s= String.valueOf(i);
		System.out.println(s+20);

	}

}
