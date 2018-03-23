package chauhan_traders;

import static org.junit.Assert.assertEquals;
import java_codes.ValidationMethods;

import org.junit.Test;

public class TestValidationMethods {
	String testData;
	boolean expected;
	
	@Test
	public void testEmailValidator() {
		testData = "test.validation@gmail.com";
		expected = true;
		assertEquals(expected,ValidationMethods.emailValidator(testData));

	}
	
	@Test
	public void testOnlyAlphabetValidator(){
		testData = "Ankur @";
		expected = true;
		assertEquals(expected,ValidationMethods.isAlphabet(testData));
	}

	@Test
	public void testMobileValidator() {
		testData = "1234567890";
		expected = true;
		assertEquals(expected,ValidationMethods.isMobileNumber(testData));

	}
}
