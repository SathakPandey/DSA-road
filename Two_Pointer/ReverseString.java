package Two_pointer;

import java.util.Arrays;

public class ReverseString {

	// LeetCode function
	public void reverseString(char[] s) {
		int l = 0, r = s.length - 1;
		while (l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {

		ReverseString s = new ReverseString();
		char[] input = { 'h', 'e', 'l', 'l', 'o' };

		System.out.println("Original: " + Arrays.toString(input));
		s.reverseString(input);
		System.out.println("Reversed: " + Arrays.toString(input));

	}

}
