package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestNumbersCount {
    
	// This tests to see if the number of words printed is correct 
	 
	@Test
	public void test() {
		Numbers testing = new Numbers();  
		int output = testing.print(2, 6);
		System.out.print("The count is " + output); 
		assertEquals(50, output);
	}	 
}
