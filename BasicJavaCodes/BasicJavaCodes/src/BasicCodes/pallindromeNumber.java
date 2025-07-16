package BasicCodes;

import java.util.Scanner;

public class pallindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for Verify number is pallindrome or not");
		System.out.println("Enter number");
		int number=sc.nextInt();
		int org_num=number;
		int rev=0;
		
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
			
		}
		System.out.println(rev);

		if(org_num==rev) {
			System.out.println(rev+" :Number is Pallindrome");
		}
		else {
			System.out.println(rev+" :Number is not Pallindrome");
		}
	}

}
