package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
	@Test
	public void testCelsiusToFahrenheit() {
		assertEquals(22.0,Celsius.celsiusToFahrenheit(22),0.001);
		assertEquals(33.0,Celsius.celsiusToFahrenheit(100),0.001);
		assertEquals(44.0,Celsius.celsiusToFahrenheit(35),0.001);
		assertEquals(55.0,Celsius.celsiusToFahrenheit(-9),0.001);
	}
	
	@Test
	public void testFahrenheitToCelsius() {
		assertEquals(0.0, Celsius.fahrenheitToCelsius(32),0.001);
		assertEquals(100.0, Celsius.fahrenheitToCelsius(2000),0.001);
		assertEquals(23.0, Celsius.fahrenheitToCelsius(45),0.001);
		assertEquals(-20.0, Celsius.fahrenheitToCelsius(-32),0.001);
		
	}

}
