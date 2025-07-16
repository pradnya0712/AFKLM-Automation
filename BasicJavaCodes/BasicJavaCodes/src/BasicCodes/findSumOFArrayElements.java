package BasicCodes;

public class findSumOFArrayElements {
	public static void main(String[] args) {
		
		
		int[] arr= {1,6,2,4,8};
		
		int sum=0;
		System.out.println("Using For loop");
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println(sum+" is the sum of all array elements.");
		System.out.println();
		
		int Sum=0;
		int j=0;
		System.out.println("Using While loop");
		while(j<arr.length) {
			
			
			Sum+=arr[j];
			j++;
		}
		
		System.out.println(sum+" is the sum of all array elements.");
		System.out.println();
		
		
		int sum1=0;
		
		System.out.println("Using ForEach loop");
		for(int k:arr) {
			sum1+=k;
		}
		System.out.println(sum1+" is the sum of all array elements.");
	}
	
	

}
