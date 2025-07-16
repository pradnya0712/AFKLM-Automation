package BasicCodes;

public class DuplicateElementFromArray {
	public static void main(String[] args) {
		
		int[] a= {1,2,2,3,5,7,45,23,45};
		boolean duplicate=false;
		int length=a.length-1;
		System.out.println("Length of given Array is: "+length);
		
		for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 System.out.println("Find Duplicate Element: "+a[i]);
					 duplicate=true;
				 }
				 
			 }
			
		}
		if(duplicate==false) {
			System.out.println("No duplicate");
		}
	}

}
