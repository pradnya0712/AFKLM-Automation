package BasicCodes;

import java.util.Scanner;

public class findQuotientandRemainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		double n1=sc.nextDouble();
		System.out.println("Enter second number ");
		double n2=sc.nextDouble();
		
		double quotient=n1/n2;
		double remainder=n1%n2;
		System.out.println("Quotient is "+ quotient);
		System.out.println("Remainder is "+remainder);
		
	}
}
