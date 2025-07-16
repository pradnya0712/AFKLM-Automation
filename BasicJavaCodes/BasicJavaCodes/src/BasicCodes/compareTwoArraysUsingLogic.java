package BasicCodes;

public class compareTwoArraysUsingLogic {

	public static void main(String[] args) {

		int[] a = { 4, 0, 1, 3, 5, 7, 8 };
		int[] b = { 44, 0, 1, 3, 5, 7, 8 };
		// --------------compare two arrays having same length----------------//

		boolean comparisonStatus = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					comparisonStatus = false;
					//System.out.println("Differnt element");
					break;
				}
				else {
					//System.out.println("Same element");
				}
			}
		} else {
			comparisonStatus = false;
			System.out.println("Arrays having differnt length");
		}
		
		
		
		if(comparisonStatus) {
			System.out.println("Both arrays having same element value. So both are same");
		}
		else {
			System.out.println("Both arrays having differnt element value. So both are not same");
		}
	}

}
