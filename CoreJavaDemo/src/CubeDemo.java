/**
 * 
 */

/**
 * @author jolve
 *
 */
public class CubeDemo {

	/**
	 * @param args
	 */
	public static int cubeanumber(int c) {
		 int cube = c*c*c;
		 return cube;
	}
	
	public static double temperature(double temperature) {
		double fahrenheit = (temperature * (9/5)) + 32;
		return fahrenheit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 30;
		int temperature = 55;
		 //method invocation
		int myAnswer = cubeanumber(r);
		
		//output
		System.out.println("Square of " + r + " is " + myAnswer);
		System.out.println("this is the temperatute"  + temperature);

// program to find half of number
	

}
}
