package OOPsPart1;

public class Local_Global_Variables {
	//Global or Class Variable
	String car= "Audi";
	static String bike= "Honda";

	public static void main(String[] args) {
		// Local Variable
		int rider= 3;
		System.out.println(rider);
		
		//Make New Obj To Access Global Variable in StaticClass
		Local_Global_Variables obj= new Local_Global_Variables();
		System.out.println(obj.car);
		System.out.println(bike);
		obj.race();
	}
		public void race(){
	
			System.out.println(bike);
			
			
		}
	 

	}


