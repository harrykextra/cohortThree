package cohortThree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	@Test
	void calculatorIsNotNullTest() {
		assertNotNull(calculator);
	}

	@Test
	void calculatorCanAddTest() {
		assertEquals(4, calculator.add(2,2));
		//fail("Not yet implemented");
		assertEquals(5, calculator.add(2,3));
	}
	
	@Test
	void calculatorCanAddDoubleTest() {
		assertEquals(14.3, calculator.add(6.2,8.1));
		//fail("Not yet implemented");
		//assertEquals(5, calculator.add(2,3));
	}
	
	@Test
	void calculatorCanSubtract() {
		assertEquals(3, calculator.subtract(5, 2));
	}
	
	@Test
	void calculatorCanSubtractAbsolutetlyTest() {
		assertEquals(3, calculator.subtract(2, 5));
	}
	
	@Test
	void calculatorCanSubtractDoubleAbsolutelyTest() {
		assertEquals(2.5, calculator.subtract(2.5, 5.0));
	}
	

}
