package BasicCodes;

import java.util.Scanner;

public class findPowerOfNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	System.out.println("Enter power");
	int power=sc.nextInt();
	int initialNumber=number;
	
	for(int i=1;i<power;i++) {
		number=initialNumber*number;
	}
	System.out.println("Power of number "+initialNumber+" is "+number);
}
}
