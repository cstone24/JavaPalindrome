package palindromes;

public class Palindrome {
	
	public static String reverseString(String input) {
		String reversed = "";
		
		for (int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			reversed = ch+reversed;
		}
		return reversed.toUpperCase();
	}
	
	public void isPalindrome(String input, String reversed) {
		String isPalindrome = input.equals(reversed) ? input + " is a palindrome." : input + " is not a palindrome";
		System.out.println(isPalindrome);
	}
}
