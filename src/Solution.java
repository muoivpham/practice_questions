
public class Solution {
	public int solution(String S) {
		int maxL = -1;
		int l = -1;
		for (int i = 0; i < S.length(); i++) {
			if (isValid(S.charAt(i))) {
				l = findLongestPass(S, i);
				if (maxL < l) {
					maxL = l;
				}
			}
		}
		return maxL;
	}

	private int findLongestPass(String s, int start) {
		// TODO Auto-generated method stub
		int l = -1;
		for (int i = start; i < s.length(); i++) {
			if (!isValid(s.charAt(i)))
				break;
			// Đi từ start => phải đ thu được pass dài nhất
			if (isValidPass(s.substring(start, i+1))) {
				l = i - start + 1;
			}

		}
		return l;
	}

	private boolean isValidPass(String pass) {
		// TODO Auto-generated method stub
		for (char c = 'A'; c <= 'Z'; c++) {
			if (pass.contains(String.valueOf(c)))
				return true;
		}
		return false;
	}

	private boolean isValid(char c) {
		// TODO Auto-generated method stub
		return (!(c >= '0' && c <= '9'));
	}

}
