package BasicCodes;

public class printNumbersWithoutUsingLoop {

	public static void main(String[] args) {

		// here we use recurssion function
		printNumbers(10);

	}

	static int count = 0;

	static void printNumbers(int n) {
		if (n > 0) {
			count = count + 1;
			System.out.print(" "+count);
			//System.out.println(count);
			printNumbers(--n);

		}

	}

}
