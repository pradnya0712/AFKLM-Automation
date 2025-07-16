package BasicCodes;

import java.util.Scanner;

public class pallindromeString {
	public static void main(String[] args) {
		
		String str="Black";
		String rev="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println(rev+" :string is pallindrome");
		}
		else {
			System.out.println(rev+" :String is not pallindrome");
		}
		
		
		//===================================//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:-- ");
		String orgStr=sc.nextLine();
		
		String revString="";
		
		for(int i=orgStr.length()-1;i>=0;i--) {
			revString+=orgStr.charAt(i);
		}
		
		System.out.println(orgStr);
		System.out.println(revString);
		
		
		if(orgStr.equalsIgnoreCase(revString)) {
			System.out.println(orgStr+" :-Pallindrome string");
		}
		else {
			System.out.println(orgStr+" :-Not Pallindrome string");
		}
	}

}
