package BasicCodes;

import java.util.Scanner;

public class compareTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		
		
		if(num1==num2) {
			System.out.println("Both numbers are same");
		}
		else if(num1>num2) {
			System.out.println(num1+" is greater than "+ num2);
		}
		else {
			System.out.println(num2+" is greater than "+num1);
		}
				
	}

}
