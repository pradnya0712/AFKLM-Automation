package BasicCodes;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		fact(4);
		Scanner sc= new Scanner(System.in);
		System.out.println("Engter number for which u want factorial: ");
		int number=sc.nextInt();
		int res=fac(number);
		System.out.println("factorial  of "+number+" using recurssion function: "+res);
	}

	static void fact(int n) {
		long fac = 1;
		for (int i = 1; i <= n; i++) {

			fac = fac * i;

		}
		System.out.println("Factorial of " + n + " is: " + fac);
	}
	
	static  int fac(int number) {
		
		if(number==1) {
			return 1;
		}else {
			
				return number*fac(number-1);	
			
		}


		
	}
}