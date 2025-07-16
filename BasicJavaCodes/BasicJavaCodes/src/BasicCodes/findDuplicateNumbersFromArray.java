package BasicCodes;

public class findDuplicateNumbersFromArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,3,8,9,8,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" is duplicated in the array");
				}
			}
		}
	}

}
