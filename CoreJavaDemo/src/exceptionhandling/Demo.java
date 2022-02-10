package exceptionhandling;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num1 = 5;
           int num2 = 5;
           int result = 0;
           
           System.out.println("going to divide..");
           
        // 1. JVM identifies the type of exception  - ArithmeticException
   		// 2. JVM creates an object of ArithmeticException
   		// 3. JVM throws the exception object - implicitly thrown
       try{
	
			result = num1 / num2;
       }catch(ArithmeticException anyRef) {
    	   System.out.println("the second number cannot be 0. Changing it to 1...");
    	   num2 = 1;
    	   result = num1/2;
       }
       System.out.println("Result is :" + result);
       
       System.out.println("Division is over...");
	}
}

	
	
	
	
