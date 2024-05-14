package PracticeQuestions;
import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Integer 1");
		int Integer1 = scanner.nextInt();

		System.out.println("Enter Integer 2");
		int Integer2 = scanner.nextInt();
		
		int sum= Integer1+Integer2;
		int subs = Integer1 - Integer2;
		int product= Integer1*Integer2;
		float div= Integer1/Integer2;

		System.out.println("Sum of the Numbers is " +sum);
		
		if(Integer1> Integer2) {
			
			System.out.println("Difference of the Numbers is " +subs);
			}
		else {
			System.out.print("Integer 1 is lower hence Substracting Integer 1 from integer 2 ");
			int subs2= Integer2 - Integer1;
			System.out.println("Difference is " +subs2);
		}
		
		System.out.println("Product of the Numbers is " +product);
		
if(Integer1> Integer2) {
			
			System.out.println("Div of the Numbers is " +div);
			}
		else {
			System.out.print("Integer 1 is lower hence Dividing Integer 2 by integer 1 ");
			float div2= Integer2/Integer1;
			System.out.println("Div is " +div2);
		}
		
	}

}
