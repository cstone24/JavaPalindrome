package palindromes;
import java.util.Scanner;

public class ReadInput {
	
		public static String getUserInput () {
			Scanner myObj = new Scanner(System.in);
			
			System.out.print("Enter String: ");
			return myObj.nextLine().toUpperCase().trim();
		}
}
