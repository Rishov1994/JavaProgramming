package PracticeQuestions;

import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the Temperature Quotient,  1 for Celsius and 2 for Farhenheit:");
			int temp= scanner.nextInt();
			
			if(temp==1) {
				System.out.println("The Temperature is in Degree Celsius: ");
				System.out.println("Enter the Temperature:");
				int cel= scanner.nextInt();
				double res= (cel*(9.0/5.0))+32;
				System.out.println("Resultant Temperature in Farhenheit Is: " +res);
				break;	
			}
			if(temp==2) {
				System.out.println("The Temperature is in Degree Farhenheit: ");
				System.out.println("Enter the Temperature:");
				int far= scanner.nextInt();
				double res= (far-32)*(5.0/9.0);
				System.out.println("Resultant Temperature in Celsius Is: " +res);
				break;
		}
			else {
				System.out.println("Enter the Correct Temperature Quotient, 1 for Celsius and 2 for Farhenheit ");}
			}

	}

}
