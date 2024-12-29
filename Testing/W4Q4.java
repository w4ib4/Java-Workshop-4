package Testing;

import java.util.ArrayList;
import java.util.List;

class NumberUnits{
	public static List<Integer> getEvenNumbers(int[] numbers){
		List<Integer> evenNumbers = new ArrayList<>();
		for (int number : numbers) {
			if (number % 2 == 0) {
				evenNumbers.add(number);
			}
		}
		return evenNumbers;
	}
}
public class W4Q4 {

}
