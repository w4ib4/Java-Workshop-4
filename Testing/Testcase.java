package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testcase {
	@Test
	public void add(){
		assertEquals(5,Calculatorr.add(2, 3));
		assertEquals(0,Calculatorr.sub(2, 2));
		assertEquals(4,Calculatorr.mul(2, 2));
		assertEquals(1,Calculatorr.div(2, 2));
	}

}
