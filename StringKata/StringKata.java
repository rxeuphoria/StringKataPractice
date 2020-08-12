package StringKata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringKata {

	private String number;

	public static String add(String number) {
		if (number == "") {
			return "0";
		} else if (number.length() == 1) {
			return number;
			//absolutely looked up this pattern.compile bit.
		} else if (number.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*(").matcher(number);
			m.matches();
			String customDelimiter = m.group(1);
			String numbers = m.group(2);
			//return numbers.split(customDelimiter);
		}
		number.trim();
		String[] twoNumbers = number.split(",|\n");
		int sum = 0;
		for (String num : twoNumbers) {
			sum = sum + Integer.parseInt(num);
		}
		return Integer.toString(sum);
	}
}
