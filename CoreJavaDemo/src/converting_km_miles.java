/**
 * 
 */

/**
 * @author jolve
 *
 */
import java.util.Scanner;
public class converting_km_miles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	
		        // Declaring the variables
		        double kiloMeters,miles;
		        // 1 mile = 1.609344 kilometers => 1 kilometer = 1/1.609344 miles.
		        double conversionFactor = 1.609344;
		 
		        // Getting user input using Scanner class
		        System.out.println("Enter distance value in Kilometers : ");
		        Scanner input = new Scanner(System.in);
		        kiloMeters = input.nextDouble();
		 
		        // To convert kilometers to miles, dividing the kilometers by 1.609344
		        miles = kiloMeters / conversionFactor;
		 
		        //printing the output
		        System.out.println("The distance in Miles : " + miles);
		 
		    }
		}
		