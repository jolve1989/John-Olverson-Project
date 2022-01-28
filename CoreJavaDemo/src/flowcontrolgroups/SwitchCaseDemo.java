package flowcontrolgroups;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //program to check of a char is a vowel or not
		
		
		//input
		char letter = 'u';
	    String output = "";
		
		//process logic //switch char or int
		switch(letter) {
		case 'a':
		  output = "vowel";
		  break;
		case 'e':
		  output = "vowel";
		  break;
		case 'o':
		  output = "vowel";
		  break;
		case 'u':
		  output = "vowel";
		  break;
		 default:
			 output = "not a vowel";
			 
		}
		
		
		//output
		System.out.println(output);
		
	}

}
