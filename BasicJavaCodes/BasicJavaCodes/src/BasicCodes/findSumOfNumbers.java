package BasicCodes;

import java.util.Scanner;

public class findSumOfNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number upto which you want to find sum");
	int number=sc.nextInt();
	int sum=0;
	
	for(int i=0;i<=number;i++) {
		sum=sum+i;
	}
	System.out.println("Sum of numbers is:"+sum);
	
}
}
