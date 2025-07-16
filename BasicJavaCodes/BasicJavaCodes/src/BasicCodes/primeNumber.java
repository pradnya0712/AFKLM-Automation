package BasicCodes;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Do u want to check wheather number is prime or not....Yes/No??");

		String res = sc.next();

		if (res.equalsIgnoreCase("yes")) {
			System.out.println("Enter how many times u want to check");
			int chance = sc.nextInt();

			for (int i = 1; i <= chance; i++) {
				if (res.equalsIgnoreCase("yes")) {

					checkPrime();
				}

			}
		} else {
			System.out.println("Thank You....!!!");

		}
	
	}

	public static void checkPrime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		int factor = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factor++;
				System.out.println(i);
			}

		}
		System.out.println("number of factors: " + factor);

		if (factor == 2) {
			System.out.println(number + " is an prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}

}
