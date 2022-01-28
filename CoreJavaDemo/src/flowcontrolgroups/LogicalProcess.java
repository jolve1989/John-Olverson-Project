package flowcontrolgroups;
import java.util.Scanner;  // Import the Scanner class

public class LogicalProcess {
	//input
	
	public static int GreatestofTwoNumber(int first) {
		//process
	//	int num;
	//	String output;
		if(first > second ) {
			//true part goes here
			System.out.println("the first is greater than of the three;" + first);
		}else {
			//false part goes here
			System.out.println("the second number is greater" + second); 
	//		return first;
		}
		return first;
		
		//output
		//System.out.println(output);
	}
	public static int GreatestofThreeNumber(int first, int second, int third) {
		//process
//		int num;
//		String output;
		if(first > third ) {
			//true part goes here
			System.out.println("the first is greater than of the three;" + third);
		}else {
			//false part goes here
			System.out.println(third);
	//		return first;
		}
		return third;
		
		//output
		//System.out.println(output);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //input three numbers
		 Scanner firstnumber = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter firstnumber");

		   String  first = firstnumber.nextLine();  // Read user input
		    
		    
		    Scanner secondnumber = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter second number");

		    Scanner thirdnumber= new Scanner(System.in); 
			String third = thirdnumber.nextLine();  // Read user input
		    System.out.println("third number  is: " + third);  // Output user input
		    
		 // Numerical input
		    int first1 = firstnumber.nextInt();
		    int second = secondnumber.nextInt();
		    int third1 = thirdnumber.nextInt();
		    
		    int output1 = GreatestofTwoNumber(first1)
		    
		    System.out.println("firstnumber is: " + output1);  // Output user input
		    System.out.println("second number  is: " + second);  // Output user input
		    System.out.println("third number  is: " + third1);  // Output user input
	}

	}


