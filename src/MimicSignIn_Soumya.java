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
public class MimicSignIn_Soumya {

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
	if (args.length==3)
	{
			String username = args[0];
			String password = args[1];
			String email = args[2];
			final int MAX_ATTEMPTS = 3;
			String username_attempt="";
			String password_attempt="";	
			String email_attempt="";
			Scanner console = new Scanner(System.in);
			 
		           
			/**
			 *  TODO write a code block that check if the user supplied the correct username and password
			 *  You should use a for loop
			 *  You should trim off spaces in-front of or after the string
			 *  Then compare the username_attempt to username and password_attempt to password
			 */
			for(int i=1;i<=MAX_ATTEMPTS;i++)
			{
				System.out.println("Username:");
				username_attempt.trim();
				username_attempt=console.nextLine();
				
				if(ValidUsername(username,username_attempt))
				{
					for(int j=1;j<=MAX_ATTEMPTS;j++)
					{
						System.out.println("Password:");
						password_attempt=console.nextLine();
						password_attempt.trim();
						if(ValidPassword(password,password_attempt))
						{
						
							System.out.println("Email:");
							email_attempt = console.nextLine();
										
								if(ValidEmail(email_attempt))
								{
									System.out.println("You have a valid email address");
								}
								else {
									System.out.println("You do not have a valid email address");
								}
								
						}else if (j==MAX_ATTEMPTS)
						{
							System.out.println("You have reached max. attempts");
							i=MAX_ATTEMPTS;
							break;
						}
					} 
					
				}
				else if (i==MAX_ATTEMPTS){
				
				    System.out.println( "You have reached max. attempts" );
				}
			}
			
				
	}
    
}	
	
	
	/**
	 * This method will take an email string and valid if it has a valid format
	 * 
	 * @param email - email string which needs to be valided for cthe correct format
	 * @return - returns true if the email is valid, returns false if it is not valid
	 */
	public static boolean ValidEmail(String email) {
		String end=".com";
		if (email.contains("@")&&email.endsWith(end)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
		public static boolean ValidUsername(String username,String username_attempt) {
			
			
			if (username_attempt.equals(username)) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
			public static boolean ValidPassword(String password,String password_attempt) {
				
				
				if (password_attempt.equals(password)) 
				{
					return true;
				}
				else 
				{
					return false;
				}
	}
}
