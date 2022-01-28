
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8 primative data types
		
		//byte -takes 1 byte of memory - whole numbers
		//short - takes 2 bytes of memory
		//long
		
		//float - decimal numbers
		//double
		
		//boolean - true or false
		
		//char - single
		
		///int literal -negative and positive whole
		//float literal - decimal number - 4.5; 2.7
		//
		
		
		//declare a variable
		int englishmark;
		
		//assigned a value to the variable
		englishmark = 20;
		
		//initialize a variable
		int mathMark = 50;
		
		System.out.println("english Mark :" + englishmark);
		System.out.println("Math Mark is " + mathMark);
		
		short test = 4567;
		
		long longTest = 234567890;
		
		boolean flag = true;
		boolean result = false;
		
		System.out.println("Flag is :" + flag);
		System.out.println("result is : " + result);
		

		char option = 'y';
		System.out.println("option is " + option);
		
		//type casting
		byte data =45;
		int myData = data; //implicit casting
		
		byte smallData = (byte)myData; //explicite casting
		//---- ---- ---- ---- ---- ---- ---- ---- 
		
		
		double socialMark = 45.67;
		//float scienceMark = 56.78 any number in decimal is doule by default
		// float scienceMark = (float)56.78; valid
		float scienceMark =56.78F;
		
		System.out.println("social mark is:" + socialMark);
		System.out.println("science mark is:" + scienceMark);
		
		
		
		
	}

}
