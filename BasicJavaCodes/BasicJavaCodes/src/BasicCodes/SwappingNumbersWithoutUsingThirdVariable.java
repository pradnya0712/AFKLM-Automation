package BasicCodes;

import java.util.Scanner;

public class SwappingNumbersWithoutUsingThirdVariable {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Program for Swapping Two Numbers without third variable");
		

		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		
		System.out.println("-----------Before Swapping-----------");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		System.out.println();
		
		//-------------By using additon,Subtraction operations-------------------//
						//		num1=num1+num2;
						//		num2=num1-num2;
						//		num1=num1-num2;
		
		
		//-------------By using additon,Subtraction operations-------------------//
						//		num1=num1*num2;
						//		num2=num1/num2;
						//		num1=num1/num2;
		
		//-------------By using additon,Subtraction operations-------------------//
								num1=num1^num2;
								num2=num1^num2;
								num1=num1^num2;
		
		
		
		
		System.out.println("-----------After Swapping-----------");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		
		
	}

}
