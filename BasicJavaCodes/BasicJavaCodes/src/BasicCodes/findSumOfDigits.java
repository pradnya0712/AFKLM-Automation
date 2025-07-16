package BasicCodes;

public class findSumOfDigits {

	public static void main(String[] args) {
		
		int number=5124;//sum of 5124=5+1+2+4=12
		int sum=0;
		while(number!=0) {
			sum=sum+number%10;//this line gives last digit.gives remainder
			number=number/10;//this line gives all digits except last digit.gives quotient.
		}
		
		System.out.println("sum of digits is "+sum);
	}
}
