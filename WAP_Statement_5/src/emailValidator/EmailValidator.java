package emailValidator;

import java.util.Scanner;

public class EmailValidator {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter an email address  : ");
		String email=scanner.nextLine();
		scanner.close();
		if(isValidEmail(email))
		{
			System.out.println("Valid email id");
		}
		else
		{
			System.out.println("Invalid email id");
		}
	}

	private static boolean isValidEmail(String email) {
		
		int atSymbolIndex=email.indexOf('@');
		if(atSymbolIndex==-1 || email.indexOf('@', atSymbolIndex+1) != -1)
			{
					return false;
			}
		
		int dotIndex=email.indexOf('.', atSymbolIndex);
		if(dotIndex==-1 || dotIndex== email.length()-1)
			{
				return false;
			}
			
		char firstChar=email.charAt(0);	
		char lastChar=email.charAt(email.length()-1);
		
		if(!isAlphanumric(firstChar) || !isAlphanumric(lastChar))
		{
			return false;
		}
		
		for(int i=0; i<email.length()-1; i++)
		{
			if(email.charAt(i)=='.' && email.charAt(i+1)=='.')
			{
				return false;
			}
		}
		return false;
	}

	private static boolean isAlphanumric(char c) {
		
		return Character.isLetterOrDigit(c) || c=='_' || c== '-';
	}
	
}
