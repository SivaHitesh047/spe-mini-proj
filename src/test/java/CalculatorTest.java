import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
	
	private static double delta = 1e-6;
	Calculator calc = new Calculator();
	
	@Test
    public void squareRootTruePositive(){
        assertEquals("Finding Square Root of a value for True positive",5,calc.squareRoot(25), delta);
        assertEquals("Finding Square Root of a value for True positive",4,calc.squareRoot(16), delta);
        assertEquals("Finding Square Root of a value for True positive",13,calc.squareRoot(169), delta);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding Square Root of a number for False positive",5,calc.squareRoot(10), delta);
        assertNotEquals("Finding Square Root of a number for False positive",6,calc.squareRoot(25), delta);
        assertNotEquals("Finding Square Root of a number for False positive",7,calc.squareRoot(36), delta);   
        
    }
	
    
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True positive",2,calc.factorial(2), delta);
        assertEquals("Finding factorial of a number for True positive",120,calc.factorial(5), delta);
        assertEquals("Finding factorial of a number for True positive",40320,calc.factorial(8), delta);

    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive",100,calc.factorial(5),delta);
        assertNotEquals("Finding factorial of a number for False positive",47,calc.factorial(4), delta);
        assertNotEquals("Finding factorial of a number for False positive",18,calc.factorial(6), delta);   
    }
	
    
    @Test
    public void logarithmTruePositive(){
        assertEquals("Finding Natural Logarithm of a number for True positive",Math.log(7),calc.logarithm(7), delta);
        assertEquals("Finding Natural Logarithm of a number for True positive",Math.log(4.7),calc.logarithm(4.7), delta);
        assertEquals("Finding Natural Logarithm of a number for True positive",Math.log(16),calc.logarithm(16), delta);
    }

    @Test
    public void logarithmFalsePositive(){
        assertNotEquals("Finding Natural Logarithm of a number for False positive",5,calc.logarithm(7), delta);
        assertNotEquals("Finding Natural Logarithm of a number for False positive",3,calc.logarithm(5), delta);
        assertNotEquals("Finding Natural Logarithm of a number for False positive",2,calc.logarithm(2), delta);
    }
    
    @Test
    public void powerTruePositive(){
        assertEquals("Finding factorial of a number for True positive",9,calc.power(3,2), delta);
        assertEquals("Finding factorial of a number for True positive",Math.pow(2.3, 3.6),calc.power(2.3,3.6), delta);
        assertEquals("Finding factorial of a number for True positive",16,calc.power(2,4), delta);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding factorial of a number for False positive",4,calc.power(3,2), delta);
        assertNotEquals("Finding factorial of a number for False positive",5,calc.power(2,3), delta);
        assertNotEquals("Finding factorial of a number for False positive",10,calc.power(3,4), delta);
    }
}