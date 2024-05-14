package JavaBasics;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,5,7,9};
		int sum=0;
		int evensum= 0;
		int oddsum=0;
		for (int i=0; i < arr.length; i++)
		{
			sum = sum +arr[i];
			if (arr[i]%2==0) {
				evensum =evensum+arr[i];
			}
			if (arr[i]%2!=0) {
				oddsum =oddsum+arr[i];
			}
		}
		System.out.println("Sum Of Even Nos " +evensum );
		System.out.println("Sum Of Odd Nos " +oddsum );
		System.out.println(+sum);
	}
}
