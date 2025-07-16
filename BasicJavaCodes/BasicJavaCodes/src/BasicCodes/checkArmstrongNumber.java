package BasicCodes;

import java.util.Scanner;

public class checkArmstrongNumber {

	public static void main(String[] args) {
		

		//armstorng number:-- cube of each digits and then is sum of cube of each
		//digits is equal to the number then it is an armstrong number
	   //ex:- 153 = 1*1*1* + 5*5*5 + 3*3*3
	//	          = 153 this is an armstrong number
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		int org_number=number;
		int isArmStrongNum=0;
		while(number>0) {
			//1342=2
			 int remainder=number%10;
			 isArmStrongNum=isArmStrongNum+(remainder*remainder*remainder);
			 number=number/10;
		}
		
		
		
		if(isArmStrongNum==org_number) {
                System.out.println("Enter number is Armstrong number" );
		}
		else {
           System.out.println("Enter number is  not Armstrong number" );

		}
	}
}
