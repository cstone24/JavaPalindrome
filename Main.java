package palindromes;

public class Main {
	public static void main(String[] args) {
		String input = ReadInput.getUserInput();
		String reversed = Palindrome.reverseString(input);
		
		var palindrome = new Palindrome();
		palindrome.isPalindrome(input, reversed);
	}
}
