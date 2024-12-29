package Testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Test4 {
	@Test
	public void testingEven() {
		int[] input = {1,2,3,4,5,6};
		
		List<Integer> output = Arrays.asList(2,4,6);
		
		List<Integer> actualOutput = NumberUnits.getEvenNumbers(input);
        
		assertEquals(output, actualOutput);
	}

}
