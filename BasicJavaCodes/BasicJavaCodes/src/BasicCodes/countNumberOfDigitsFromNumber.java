package BasicCodes;

public class countNumberOfDigitsFromNumber {
	public static void main(String[] args) {
		
		int num=346304;
		int org_num=num;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("There are "+count+" digits in the given "+org_num+" number");
		
	}

}
 