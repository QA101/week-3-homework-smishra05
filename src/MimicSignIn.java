import java.util.Scanner;

/**
 * This programming challenge requires the use of string methods, for loops, and nested if statements
 * This program is intended to mimic a log-in string in a terminal window and validation of an email address
 * 
 * This is a challenge exercise and will require time to investigate.
 * 
 * @author dustin
 *
 */
public class MimicSignIn {

	/**
	 * Main method should first read arguments from terminal.
	 * first argument -> username
	 * second argument -> password
	 * third argument -> email
	 * If the number of argument is not equal to 3, the program should exit immediately.
	 * 
	 * Then, the program should ask the user to sign in (username and password)
	 * 
	 * They have three attempts to log in, otherwise it should exit
	 * 
	 * Finally, it should tell them if they have a valid email address
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  TODO Check if the arguments is the right length.
		 *  If not the right length, exit immediately.
		 */ 
		if(true) {
			String username = args[0];
			String password = args[1];
			String email = args[2];
			final int MAX_ATTEMPTS = 3;
			String username_attempt = "";
			String password_attempt = "";			
			Scanner console = new Scanner(System.in);
			
			/**
			 *  TODO write a code block that check if the user supplied the correct username and password
			 *  You should use a for loop
			 *  You should trim off spaces in-front of or after the string
			 *  Then compare the username_attempt to username and password_attempt to password
			 */
			//for(something){
				System.out.println("Username:");
				console.nextLine();
				
				System.out.println("Password:");
				console.nextLine();
			//}
			
			/**
			 * What is a valid email address?
			 */
			if(true) {
				System.out.println("You have a valid email address");
			}
			else {
				//I am dead code because my IF statement is always true. <-- FIX ME
				System.out.println("You do not have a valid email address");
			}
			
			//closing console
			console.close();
		}
		else {
			//I am dead code because my IF statement is always true. <-- FIX ME
			System.out.println("wrong number of elements");
		}
	}
	
	/**
	 * This method will take an email string and valid if it has a valid format
	 * 
	 * @param email - email string which needs to be valided for cthe correct format
	 * @return - returns true if the email is valid, returns false if it is not valid
	 */
	public static boolean ValidEmail(String email) {
		if (true) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
