package BasicCodes;

import java.util.Scanner;

public class findLargestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		sc.close();
		//-----------------first approach using if-else if-else statement---------------------//
		System.out.println("Using if-else statement");
		if((num1>num2)&& (num1>num3)) {
			System.out.println(num1+" is largest number.");
		}
		else if(num2>num3) {
			System.out.println(num2+" is largest number.");
		}
		else {
			System.out.println(num3+" is largest number.");
		}
		
		
		//----------------------2nd approach using ternary operator-----------------------------//
		System.out.println("using ternary operator");
		
		int largest=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
				System.out.println(largest+" is the largest number of three numbers");
		
	
		
	}

}
