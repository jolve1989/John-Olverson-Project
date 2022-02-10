package junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void testAddPositive(){
		Calculator calc = new Calculator();
		int actualOutput = calc.add(5,7);
		
		int expectedOutput = 12;
		
	//	assertEquals();
		
		//use this if youu dont want to static import
		//Assertionions.asserrtEquals();
		assertEquals(expectedOutput, actualOutput);
		}
}