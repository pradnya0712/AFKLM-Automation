package BasicCodes;

public class sumOfArray {
	public static void main(String[] args) {
		
		int[] arr= {1,2,5,3,1,5,6};
		int sum=0;
		
		//------------Using for loop-----------------------------------//
			//		for(int i=0;i<=arr.length-1;i++) {
			//			sum+=arr[i];
			//		}
			//		System.out.println("Sum of array elements are: "+sum);
			
		
		
		//--------------------Using forEach loop----------------------//
					for(int a:arr) {
						sum+=a;
					}
					System.out.println("Sum of array elements are: "+sum);
				}

}
