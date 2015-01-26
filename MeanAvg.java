import java.util.Scanner;

public class MeanAvg {

	/**
	 * Requests 10 numbers from the user and then print the mean average.
	 */
	public static void mean() {
		double total = 0;
		int inputTotal = requestInputTotal();
		for (int i = 0; i < inputTotal; i++) {
			total = total + requestNumber();
		}
		System.out.println("The mean average of your inputs is " + (total / inputTotal));
	}

	/**
	 * Request a number from the user. Repeats until the user has succesfully inputted a number.
	 */
	public static double requestNumber() {
		double result = 0;
		System.out.print("Please add a number: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextDouble()) {
			result = sc.nextDouble();
		} else {
			System.out.println("Not a number, please try again.");
			result = requestNumber();
		}
		return result;
	}

	/**
	 * Asks a user how many inpus they wish to make.
	 */
	public static int requestInputTotal() {
		int result = 0;
		System.out.print("To calculate the mean average, first, please tell me how many inputs you wish to make: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			result = sc.nextInt();
		} else {
			System.out.println("Not a number, please try again.");
			result = requestInputTotal();
		}
		return result;
	}

	public static void main(String[] args) {
		mean();
	}
}