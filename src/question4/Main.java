package question4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two number for for a and b");
		int a=input.nextInt();
		int b=input.nextInt();
		
		try {
			int result=a/b;
			System.out.println("the qutient of "+a+"/"+b+" is "+result);
			
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("inside finally block");
		}
		
	}

}
