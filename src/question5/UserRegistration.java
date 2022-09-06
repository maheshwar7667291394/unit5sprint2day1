package question5;

import java.util.Scanner;

public class UserRegistration {
	
public static void	registerUser(String username, String userCountry)throws Exception{
	if(!userCountry.equalsIgnoreCase("india")) {
		InvalidCountryException ae=new InvalidCountryException("User Outside India cannot be registered");
		throw ae;
	}
	else {
		System.out.println("user registration done successfull");
	}
		
	}

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter user name");
	String name=input.next();
	System.out.println("enter  the country");
	String country=input.next();
	
	try {
		registerUser(name, country);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("thank you!");
	
	
}

}
