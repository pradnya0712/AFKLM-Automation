package BasicCodes;

import java.util.Arrays;

public class findMissingElementFromArray {

	public static void main(String[] args) {
		
		int[] a= {1,7,6,2,3,4};
		//for this scenario array must be in sorted format
		
		Arrays.sort(a);
		int rang=a[a.length-1];
		System.out.println(rang);
		
		//find the sum of all element without having missing element
		int sumWithouMissingEle=0;
		for(int i=1;i<=rang;i++) {
			sumWithouMissingEle+=i;
		}
		System.out.println("Sum of Array without missing element "+sumWithouMissingEle);
		
		
		//find sum with missing element
		int sumMissingEle=0;
		for(int i=0;i<a.length;i++) {
			sumMissingEle+=a[i];
		}
		System.out.println("Sum of Array with missing element "+sumMissingEle);
		
		
		//find missing element
		System.out.println("Missing element is: "+(sumWithouMissingEle-sumMissingEle) );
		
	}
}
