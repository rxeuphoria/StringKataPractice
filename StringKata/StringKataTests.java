package StringKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringKataTests {
	
	@Test
	void inputEmptyTest() {
	
		assertEquals("0", StringKata.add(""), "does not compute");
		
	}
	
	@Test
	void inputOneNumberSum() {
		//a single number just returns  itself
		
		assertEquals("1", StringKata.add("1"));
		
	}
	
	@Test
	void inputTwoNumbersSum() {
		
		assertEquals("5", StringKata.add("2,3"));
	}
	
	
	@Test
	void inputMultipleNumbersSum() {
		assertEquals("20", StringKata.add("1,2,4,3,5,5"));
	}
	
	@Test
	void newLineAsSeparator() {
		assertEquals("6", StringKata.add("1\n2,3"), "you want the \n to separate like a comma.");
	}
	
	@Test
	void customerSeparatorSupport() {
		assertEquals("6", StringKata.add("//|\n1|2|3"));
	}
}
