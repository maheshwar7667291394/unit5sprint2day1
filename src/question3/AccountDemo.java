package question3;

import java.security.AccessControlContext;
import java.util.Scanner;

public class AccountDemo {
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		Account account=new Account("1232333223",500);
	
		
		while(true) {
			System.out.println("want deposite yes/no");
			String s=input.next();
			if(s.equalsIgnoreCase("yes")) {
				System.out.println("Enter amount for deposite");
				double amt=input.nextDouble();
				account.deposit(amt);
				break;
				
			}
			else
				break;
		}
		
		
		 
	
		   
		   while(true) {
			   System.out.println("want to withdraw yes/no");
			   String s1=input.next();
			   if(s1.equalsIgnoreCase("yes")) {
				   System.out.println("Enter the amount for withdra");
				   double amt1=input.nextDouble();
				   
				   try {
					   
					   double withdra=account.withdraw(amt1);
					    System.out.println("Withdrabale amount: "+withdra);
					    System.out.println("remaining balance is: "+account.getBalance());
					    break;
					   
				   }
				   catch (Exception e) {
					   System.out.println(e.getMessage());
					   break;
				
				}
				   
			   }
			   else
				   break;
		   }
		   
		   
	   
	   
		
		System.out.println("Thnkyou!");
		
	}

}
