package BasicCodes;

import java.util.Scanner;

public class ParsingExamples {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to convert into number");
		String num=sc.nextLine();
		int number=Integer.parseInt(num);
		System.out.println(number+1);
		
		System.out.println("Enter number to convert into string");
		int n=sc.nextInt();
		String str=Integer.toString(n);
		System.out.println(str.length());

	}
}
