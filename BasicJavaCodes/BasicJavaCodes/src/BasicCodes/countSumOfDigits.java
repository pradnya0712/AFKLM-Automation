package BasicCodes;

public class countSumOfDigits {
	public static void main(String[] args) {
		
		int num=134250122;
		int org_num=num;
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
			
			
		}
		System.out.println("Sum of "+org_num+" is "+sum);
	}

}
