package BasicCodes;

import java.util.Scanner;

public class reverseNumberByUSingThreeWays {
	public static void main(String[] args) {
		System.out.println("-------Program for Reversing a number------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		// --------------By using logic----------------------------//
					//		int rev = 0;
					//
					//		while (num != 0) {
					//			rev = rev * 10 + num % 10;
					//			num = num / 10;
					//
					//		}
					//		System.out.println(rev);
						
							
		//------------------By using StringBuffer class---------------------------------//
					//		StringBuffer sb=new StringBuffer(String.valueOf(num));
					//		StringBuffer n=sb.reverse();
					//		System.out.println(n);
		
		
		//----------------By using StringBuilder class----------------------------------//
							StringBuilder s=new StringBuilder();
							s.append(num);
							StringBuilder res=s.reverse();
							System.out.println(res);
	}

}
