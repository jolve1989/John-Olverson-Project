package flowcontrolgroups;

public class IFdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//program to check if a number is greater than 10
		//input
		int number = 40;
		String output = "";
		
		
		//process - logic
		if(number > 10) {
			//true part goes here
			output= "the number is greater than 10;";
		}else {
			//false part goes here
			output = "the " + number + " is greater tha 10";
		}
		
		//output
		System.out.println(output);
		
	}

}
