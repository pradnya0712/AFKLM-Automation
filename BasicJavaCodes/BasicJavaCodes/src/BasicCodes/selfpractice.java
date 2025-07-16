package BasicCodes;

import java.util.Scanner;

public class selfpractice {
	public static void main(String[] args) {

		// Q1. Swapping to numbers

		// 1st way:-using thrird variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
//		System.out.println("Enter second number:");
//		int n2 = sc.nextInt();

//		int temp = 0;

	//	System.out.println("Number before swapping :" + n1 + " " + n2);
//		temp = n1;
//		n1 = n2;
//		n2 = temp;

	//	System.out.println("Number after swapping :" + n1 + " " + n2);
		
		//2nd way:- using airthmetic oprator
		
//		n1=n1+n2;
//		n2=n1-n2;
//		n1=n1-n2;
//		
//		System.out.println("Number after swapping :" + n1 + " " + n2);
		
		//3rd way:-using XOR operations
//		 n1=n1^n2;
//		 n2=n1^n2;
//		 n1=n1^n2;
//		 
//	   System.out.println("Number after swapping :" + n1 + " " + n2);
	   
	   //4th way:- using multiplication and dividation
	//   n1=n1*n2;
//	   n2=n1/n2;
//	   n1=n1/n2;
//		System.out.println("Number after swapping :" + n1 + " " + n2);

		
		
		//Q2. Reverse number
		
		//1st way:- using logic
//		int rev=0;
//		while(n1!=0) {
//			rev=rev*10+n1%10;
//			n1=n1/10;
//		}
//		System.out.println(rev);
		
		//2nd way:- using StringBuffer class
//		StringBuffer reversed;
//		StringBuffer sb=new StringBuffer(String.valueOf(n1));
//		reversed=sb.reverse();
//		System.out.println("Using stringBuffer class "+reversed);
//		
//		//3rd way:- Using StringBuilder class
//		StringBuilder sb1= new StringBuilder();
//		sb1.append(n1);
//		System.out.println("Using StringBuilder class "+sb1.reverse());
		
		
		//Q3. Reverse string
		
		//1st way:-Using logic
		
//		System.out.println("Enter String to reverse");
//		String s=sc.next();
//	String rev="";
//	
//	for(int i=s.length()-1;i>=0;i--) {
//		rev+=s.charAt(i);
//	}
//	
//		System.out.println(rev);	
		
		
		//2nd way:- using StringBuffer class
		
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println("Reverse string is: "+ sb.reverse());
//		
//		
//		//3rd way:- Using StringBuilder class
//		StringBuilder sb1=new StringBuilder();
//		sb1.append(s);
//		System.out.println("Reverse string is: "+ sb1.reverse());
		
		
		//Q4. Check number is palindrome or not
//		int originalNo=n1;
//		int rev=0;
//		while(n1!=0) {
//			rev=rev*10+n1%10;
//			n1=n1/10;
//		}
//		System.out.println("reverse number is: "+rev);
//		
//		if(originalNo==rev) {
//			System.out.println("Enter number is  palindrome "+originalNo);
//		}
//		else {
//		
//			System.out.println("Enter number is not palindrome "+originalNo);
//		}
//		 
		
		//Q5. check wheather enter string is palindrome or not.
//		String s=sc.next();
//		String rev="";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev+=s.charAt(i);
//		}
//		
//		System.out.println("Reverse string is  "+rev);
//		
//		
//		if(s.equalsIgnoreCase(rev)) {
//			System.out.println("String is Palindrome");
//		}
//		else {
//			System.out.println("String is not Palindrome");
//		}
//	
		
		
		//Q6. count total number,even and odd digits in the  number
		
//		int originalNo=n1;
//		int count=0;
//		int rev=0;
//		int even=0;
//		int odd=0;
//		while(n1!=0) {
//			rev=n1%10;
//			if(rev%2==0) {
//				System.out.println("even: "+rev);
//				even++;
//			}
//			else {
//				System.out.println("Odd: "+rev);
//				odd++;
//			}
//			count++;
//			
//			n1=n1/10;
//			
//		}
//		
//		System.out.println("there are "+count+"  digits in the number");
//		System.out.println("there are "+even+" even digits in the number");
//		System.out.println("there are "+odd+" odd digits in the number");
//		
		//Q7. sum the digits of number
//		int sum=0;
//		while(n1!=0) {
//			sum=sum+n1%10;
//			n1=n1/10;
//			
//		}
//		System.out.println("The sum of digits is: "+sum);
		
		//Q8. Find largest number out of 3.
		
		//1st way:- using  binary operator
//		System.out.println("Enter second number: ");
//		int n2=sc.nextInt();
//		System.out.println("Enter third number: ");
//		int n3=sc.nextInt();
		
//		if(n1>n2 && n1>n3) {
//			System.out.println("n1 is greater than n2 and n3");
//		}
//		else if(n2>n1 && n2>n3) {
//			System.out.println("n2 is greater than n1 and n3");
//		}
//		else {
//			System.out.println("n3 is greater than n1 and n2");
//		}
		
		//2nd way:- using ternary operator
		
//		int LargestNo1= n1>n2?n1:n2;
//		int LargestNo2=n3>LargestNo1?n3:LargestNo1;
//		
//		if(LargestNo1>LargestNo2) {
//			System.out.println(LargestNo1 +" is greater than "+ LargestNo2);
//		}
//		else {
//			System.out.println(LargestNo2 +" is greater than "+ LargestNo1);
//		}
		 
		
		//Q9. generate fibbonacci series
//		int a=0;
//		int b=1;
//		int c = 0;
//		System.out.println("Fibbonacci series is: ");
//		 System.out.print(a+" "+ b);
//		for(int i=2;i<=n1;i++) {
//			 c=a+b;
//			 System.out.print(" "+ c);
//		  a=b;
//		  b=c;
//		  
		 
		  
		}
		
		
		
		
	}


