package JavaBasics;

import java.text.AttributedCharacterIterator;

public class JavaProg_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dataypes in Java
		
		//Int
		
		int i=10;
		i=20; //replaces initial value
		int i1=30;
		System.out.println(i);
		System.out.println(i+i1);
		
		
		//Double
		
		double d1= 24.54;
		double d2= 42; //Can Store int value in Double
		System.out.println(d1);
		//Char
		
		char a='A';
		char b='B';
		char c='2';
		System.out.println(a);
		
		
		
		//Boolean
		boolean b1=true;
		boolean b2=false;
		System.out.println(b2);
		
		
		//Above DataTypes Are called Primitive DataTyepes
		
		//String
		String s1= "Rishov";
		String s2="Learning Java";
		System.out.println(s1);
		//Sting is a Class not DATATYPE
		
		
		
		//Concatenation
		String str= Character.toString(a)+ Character.toString(b);
		System.out.println(str);
		System.out.println("Thae Sum is:"+(i+i1));
		System.out.println("My Name is:"+s1);
		System.out.println("My Current Aim is:"+s2);
		
		
		
		
		
		
		
		
		
		
	}

}
