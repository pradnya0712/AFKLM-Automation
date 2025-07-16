package BasicCodes;

public class Even_OddElementsFromArray {

	public static void main(String[] args) {
		int[] a= {1,5,22,3,4,8,12};
		int even=0;
		int odd=0;
		for(int i:a) {
			if(i%2==0) {
				System.out.println("even: "+i);
				even++;
			}
			else {
				System.out.println("odd: "+i);
				odd++;
			}
			
		}
		System.out.println("There are "+even+" even elements in array");
		System.out.println("There are "+odd+" odd elements in array");
	}
}
