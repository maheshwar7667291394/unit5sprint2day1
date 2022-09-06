package question1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input=new  Scanner(System.in);
		System.out.println("Enter any number that for Square");
		
		
		try {
		     String s=input.next();
			int i=Integer.parseInt(s);
			System.out.println(i*i);
			
		}
		catch (NumberFormatException e) {
			System.out.println("Entered input is not valid formate for integer");
			
		}
		System.out.println("The work has been done successfully");
		
		
	}

}
