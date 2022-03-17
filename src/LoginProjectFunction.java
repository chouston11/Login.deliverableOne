import java.util.Scanner;

public class LoginProjectFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scnr = new Scanner(System.in);
		
				System.out.println("Create a new password below.");
				System.out.println("The password must contain:");
				System.out.println("	At least one lowercase letter");
				System.out.println("	At least one uppercase letter");
				System.out.println("	At least minimum 7 characters");
				System.out.println("	At least maximum 12 characters");
				System.out.println("	An exclamation point: !");
				System.out.println("Enter New Password Here:");

				String password = scnr.nextLine();
				String messageOne = "Password valid and accepted";
				String messageTwo = "Error";
				password.length();
				
				//System.out.println(password.length());
				
				boolean a = false;
				if(password.length() < 7 || password.length() > 12) {
					System.out.println("Password length has to be between 7-12 characters");
					a = false;
				} else if (password.length() >= 7 && password.length() <=12) {
					a = true;
				}
			
				
				boolean b = false;
				int i = 0;
				while (!b) {
					if(Character.isUpperCase(password.charAt(i))) { //looking for upper
						System.out.println("**your password satisfies the requirement for an uppercase letter");
						b = true;
					} else {
						System.out.println("**password must contain one uppercase letter");
						b = true;
						}
				}
				/*for (int i = 0; i < password.length(); i++)
					if(Character.isUpperCase(password.charAt(i))) { //looking for upper
						System.out.println("looks like your making a strong password");
						b = true;
						if(b=true) {break;}
					} /*else {
						System.out.println("**Password must contain one uppercase letter");
						b = true;
					}*/
				
				boolean c = false;
				while (!c) {
					if(password.indexOf("!", 0) > -1) {
						System.out.println("**your password satisfies the requirement for an (!)");
						c = true; 
					} else {
						System.out.println("**password still needs an (!)");
						c = true;
					}
				}
				/*for (int j = 0; j < password.length(); j++)
					if(password.indexOf("!", 0) > -1) {
						System.out.println("yepp");
						c = true;
						if(c=true) {break;} */
					//} /*else {
						//System.out.println("**Your password must contain an exclamation mark (!)");
					//}*/
			
				
				if (a == true && b == true && c == true) {
					System.out.println(";)   Password valid and accepted: " + password);
					} else {
					System.out.println(":(  Error: " + password);
					}
				//read scanner
				//count to 12 ..record count (length) of string 
				//identify character "!, lower, & upper"
				//https://www.w3schools.com/java/ref_string_indexof.asp#:~:text=The%20indexOf()%20method%20returns,(s)%20in%20a%20string. 
				//if(boolean1 == true && boolean2 == true && boolean3 == true) {
					//System.out.println("Valid password");
					//} else {System.out.println("Error");}
				
				
				
				
				
		
				
					//if () {System.out.println(messageOne);}
				
				//if (password != "yaba"){System.out.println(messageTwo);}
					
		/*
		If fulfilled, print string "Password valid and accepted"
		If failed, print string "error"
		 */
		
		
				
	}

}
