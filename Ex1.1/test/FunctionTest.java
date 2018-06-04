import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {

	@Test
	public void getFunction() {
		Function funTest = new Function();
		
		double runTestMinY = funTest.getFunction(5,1);
		assertEquals(10.0, runTestMinY,0.1);
		
		double runTestMinesY = funTest.getFunction(5,-1);
		assertEquals(-10.0, runTestMinesY,0.1);
		
		double runTestMaxY = funTest.getFunction(5,10);
		assertEquals(1.0, runTestMaxY,0.1);
		
		double runTestMinX = funTest.getFunction(1,5);
		assertEquals(1.2, runTestMinX,0.1);
		
		double runTestMaxX = funTest.getFunction(40000000,5);
		assertEquals(8000001.0, runTestMaxX,0.1);
		
		double runTestMinesX = funTest.getFunction(-3,2);
		assertEquals(1.0, runTestMinesX,0.1);
	
	}
	
		
	@Test (expected = ArithmeticException.class)
	public void getFunctionTwo() {
		Function funTest = new Function();
		double runTestException = funTest.getFunction(5,0);
	}

}
