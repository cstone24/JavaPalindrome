package palindromes;

public class Main {
	public static void main(String[] args) {
		String input = ReadInput.getUserInput();
		String reversed = Palindrome.reverseString(input);
		Palindrome.isPalindrome(input, reversed);
	}
}
