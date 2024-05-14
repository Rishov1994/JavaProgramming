package JavaBasics;

public class ComparisonOperators {

	public static void main(String[] args) {
		
	
		//If-Else Concepts
	
		int a= 50;
		int b= 44;
		int c= 60;
		
		if (a>b) {
			System.out.println("a is greater");
		}
		else if (b<a){
			System.out.println("b is greater");
		}
		else {
			System.out.println("Cannot Determine");
		}
			
		//nestedif
		
		if (a>b & a>c) {
			System.out.println("a is the greatest");
		}
		else if (a>b & a<c) {
			System.out.println("a is not the greatest");
		}
		else if (b>a & b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the geratest");
		}
	}

}
