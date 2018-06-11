/*
 * Given a string containing uppercase alphabets and integer digits (from 0 to 9), 
 * the task is to print the alphabets in the order followed by the sum of digits.
 * Examples:
 * Input : AC2BEW3
*Output : ABCEW5
*Alphabets in the lexicographic order 
*followed by the sum of integers(2 and 3).
 */
public class RearrangeString {
	public static void main(String[] args) {
		String str = "ACCBA10D2EW30";
		System.out.println(arrangeString(str));
	}

	static int MAX_CHAR = 26;

	static String arrangeString(String str) {
		// TODO Auto-generated method stub
		int char_count[] = new int[MAX_CHAR];
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				char_count[str.charAt(i) - 'A']++;
			} else
				sum = sum + (str.charAt(i) - '0');
		}

		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = (char) ('A' + i);
			while (char_count[i]-- != 0) {
				res = res + ch;
			}
		}
		if (sum > 0) {
			res = res + sum;
		}
		return res;
	}
}
