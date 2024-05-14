package OOPsPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		// Make Obj for Calling Methods
		MethodOverLoading obj= new MethodOverLoading();
		obj.sum();
		obj.sum(50);
		obj.sum(100, 10);
	}
		//We can Overload main Method
		public static void main(int r) {
			
		}
		public static void main(double r) {
			
		}
		public static void main(String r) {
			
		}

	

	public void sum() {
		System.out.println("Zero param Method");
		
	}
	public void sum(int i) {
		System.out.println("One Param Method");
		System.out.println(i/5);
	}
	public void sum(int j, int k) {
		System.out.println("Two Param Method");
		System.out.println(j/k);
	}
}//All methods will have diff arguments or paraams
