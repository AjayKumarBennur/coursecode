package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {	
	Calculator calculator;
	
	@BeforeAll
	void beforAll() {
		System.out.println("before all");
	}
	@BeforeEach
	public void init() {
		calculator= new Calculator();
	}

	@Test
	@Disabled
	public void isEvenTest() {
		boolean expected = true;
		boolean actual = calculator.isEven(10);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("Odd number test")
	public void isOddTest() {
		boolean expected = true;
		boolean actual = calculator.isOdd(9);
		assertEquals(expected, actual,"The number is not odd");
	}
	
	
	
}
