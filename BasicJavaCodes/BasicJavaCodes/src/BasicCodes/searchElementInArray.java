package BasicCodes;

import java.util.Scanner;

public class searchElementInArray {
	public static void main(String[] args) {
		
		int[] a= {1,54,98,500,34};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number which want to find in the array. ");
		int num=sc.nextInt();
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			
			if(num==a[i]) {
				System.out.println("Element found at location: "+i);
				found=true;
				break;
				
			}
			
		}
		
		
		
		if(found) {
			System.out.println(num+ " Element found ");
		}
		else {
			System.out.println(num+ " Element not found");
		}
		
		
	}

}
