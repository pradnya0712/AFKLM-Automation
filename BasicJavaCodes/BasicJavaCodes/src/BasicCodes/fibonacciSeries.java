package BasicCodes;

public class fibonacciSeries {
	public static void main(String[] args) {
		fibonacci(5);
	}

	static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + " " + b);
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;

			System.out.print(" " + c);
		}

	}

}
