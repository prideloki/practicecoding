import java.util.Arrays;

public class DivisorDigits {

	public int howMany(int number) {
		int[] digits = new int[10];
		int count = 0;
		//count how many digits in number
		//int length = String.valueOf(number).length;
		
		String numberS = String.valueOf(number);
		
		for (int i = 0; i < numberS.length(); i++) {
			char c = numberS.charAt(i);
			digits[Integer.parseInt(c + "")]++;
		}

		for (int i = 1; i < digits.length; i++) {
			if (digits[i] > 0) {
				
				if (number % i == 0) {
					count+=digits[i];
					
				}

			}
		}
		
		return count;
	}

}
