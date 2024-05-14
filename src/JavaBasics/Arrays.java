package JavaBasics;

public class Arrays {

	public static void main(String[] args) {
		
		//Int Array or Double Array (One Dimensional Array)
		//Static Array- Fixed Size, Single Data Type
		
		int i[]= new int[4];
		i[0]=5;
		i[1]=10;
		i[2]=15;
		i[3]=20;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[0]);
		
		//Size Of Array
		System.out.println("Length Of Array Is:" +i.length);
		
		//All Values Of Array
		for(int j=0; j<i.length;j++) {
			System.out.println(j);
		}
				
		
		System.out.println("New Prog");
		
		
		//Object Array, to store Multiple DataTypes (Object is a Class)
		
		Object obj[]= new Object[5];
		obj[0]= "Rishov";
		obj[1]= "Accenture";
		obj[2]= 1035400 ;
		obj[3]= 1102457.285;
		obj[4]= 27_06_1994;
		
		System.out.println("Length Of Array Is:" +obj.length);
		
		for(int o1=0; o1<obj.length;o1++) {
			System.out.println(obj[o1]);
		}
		
		
		
		

	}

}
