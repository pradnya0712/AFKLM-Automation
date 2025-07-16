package BasicCodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateValueFromArray {

	
	public static void main(String[] args) {
		
		//duplicate value from array can be remove by using Set datastructure.
		
		
		int[] arr= {1,5,7,5,8,9,9,23};
		
		Set<Integer> set=new HashSet<Integer>();//here create set
		
		for(int i=0;i<=arr.length-1;i++) {
			set.add(arr[i]);//here add values into set.set consists only unique values
		}
		
		System.out.println(set);
		
		Integer[] uniqueArr=set.toArray(new Integer[set.size()]);//here we convert set to array
		
		System.out.println(Arrays.toString(uniqueArr));//here arrays convert into string
	}
}
