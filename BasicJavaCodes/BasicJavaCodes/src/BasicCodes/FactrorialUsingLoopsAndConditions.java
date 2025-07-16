package BasicCodes;

import java.util.Scanner;

public class FactrorialUsingLoopsAndConditions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for how much time u want to execute the script");
		int chance=sc.nextInt();
		String response;
		Fact();
		for (int i = 1; i <= chance; i++) {
			System.out.println("Do you want to try again Y/N");
			response = sc.next();
			if (response.equals("Y")) {
				Fact();

			} else {
				System.out.println("ByeBye");
				break;
			}

		}

	}

	
	public static void Fact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range for factorial");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("Enter number for which u want to find factorial");
			int n = sc.nextInt();
			int result = factorial(n);
			System.out.println(result);

		}
		System.out.println("Thank You...!");
	}

	static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}

	}

}
