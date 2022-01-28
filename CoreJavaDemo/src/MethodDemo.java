//write a program to squre a number
//input
//process
//output

public class MethodDemo {
	//method definition
	public static int squareofnumber(int num) {
		//process
		int ans = num * num;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //input
		int number = 30;
		 //method invocation
		int myAnswer = squareofnumber(number);
		//output
		
		System.out.println("Square of " + number + " is " + myAnswer);
		
	}

}
