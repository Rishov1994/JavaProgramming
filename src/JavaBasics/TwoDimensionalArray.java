package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Object obj[][]= new Object[5][5];
		obj[0][0]= "Rishov";
		obj[0][1]= 29;
		obj[0][2]= "Accenture" ;
		obj[0][3]= "Hyderabad";
		obj[0][4]= "Playing";
		
		obj[1][0]= "Debolina";
		obj[1][1]= 34;
		obj[1][2]= "Syneos Health" ;
		obj[1][3]= "Hyderabad";
		obj[1][4]= "Sleeping";
		
		obj[2][0]= "Mira Rani";
		obj[2][1]= 55;
		obj[2][2]= "Sreepalli" ;
		obj[2][3]= "Silchar";
		obj[2][4]= "Praying";
		
		obj[3][0]= "Riten";
		obj[3][1]= 63;
		obj[3][2]= "APhC" ;
		obj[3][3]= "Das Colony";
		obj[3][4]= "Writing";
		
		obj[4][0]= "Munna Sarma Roy";
		obj[4][1]= 58;
		obj[4][2]= "Anupama Apartment" ;
		obj[4][3]= "Ambikapatty";
		obj[4][4]= "Kabutar receiving & sometimes cooking";
		
		for(int row=0; row<obj.length; row++) {
			for (int col=0; col<obj[0].length; col++) {
				System.out.println(obj[row][col]);
			}
		}

	}

}
