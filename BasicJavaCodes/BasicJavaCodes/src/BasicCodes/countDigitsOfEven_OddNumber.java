package BasicCodes;

public class countDigitsOfEven_OddNumber {
	public static void main(String[] args) {

		int num=2468;
		int org_num=num;
		int rev=0;
		int even=0;
		int odd=0;
		while(num>0) {
			
			rev=num%10;
			
			if(rev%2==0) {
				System.out.println(rev+" "+" : is even number");
				even++;
			}
			
			else {
				System.out.println(rev+" : is odd number");
				odd++;
			}
			num=num/10;
		}
		System.out.println("There are "+even+" even numbers in "+org_num);
		System.out.println("There are "+odd+" odd numbers in "+org_num);
		
	}

}
