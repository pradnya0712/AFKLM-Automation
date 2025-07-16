package BasicCodes;

import java.util.Scanner;

public class findSumOfEvenOddNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number upto which you want to find sum");
	int number=sc.nextInt();
	int evenSum=0;
	int oddSum=0;
	
	for(int i=1;i<number;i++) {
		if(i%2==0) {
			evenSum=evenSum+i;
		}
		else {
			oddSum=oddSum+i;
		}
	}
	System.out.println("sum of even number upto "+number+" is "+evenSum);
	System.out.println("sum of odd number upto "+number+" is "+oddSum);

	
}
}
