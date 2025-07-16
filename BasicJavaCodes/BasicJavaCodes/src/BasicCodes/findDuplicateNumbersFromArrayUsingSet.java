package BasicCodes;

import java.util.HashSet;
import java.util.Set;

public class findDuplicateNumbersFromArrayUsingSet {

	
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,3,7,7,9,9};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(set.add(arr[i])==false) {
				System.out.println(arr[i]+" is duplicated in the array");
			}
		}
	}
}
