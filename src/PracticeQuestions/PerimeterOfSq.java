package PracticeQuestions;

import java.util.Scanner;

public class PerimeterOfSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		
	
		Scanner scanner=  new Scanner(System.in);
		while(true) {
		System.out.println("Enter 1 For Square 2 For rectangle");
		int type= scanner.nextInt();
		
		
		if(type==1) {
			System.out.println("It is a Square");
			System.out.println("Enter the Length Of the Square: ");
			int length= scanner.nextInt();
			//Perimeter Of sq= 4*Length
			int per= 4* length;
			System.out.println("Perimeter Of The Square is: " +per);
			break;	
		}
		else if(type==2) {
			System.out.println("It is a Rectangle");
			System.out.println("Enter the Length Of the Rectangle: ");
			int length= scanner.nextInt();
			System.out.println("Enter the Breadth Of the Rectangle: ");
			int breadth= scanner.nextInt();
			//Perimeter Of rec= 2*(Length+Breadth)
			int per= 2*(length+breadth);
			System.out.println("Perimeter Of The Rectangle is: " +per);
			break;
		}
		
		else {
			System.out.println("Invalid Input, Enter 1 for Square 2 For Rectangle");
		}
		}

	}

}
