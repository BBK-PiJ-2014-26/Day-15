import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Patient {
	private int yearOfBirth;
	private String name;

	/**
	 * @throws an IllegalArgumentException when the age derived from yearOfBirth is greater than 130 and less than zero.
	 */
	public Patient(String name, int yearOfBirth) throws IllegalArgumentException {
		this.name = name;
		int age = 2015 - yearOfBirth;
		if (age < 0 || age > 130) {
			throw new IllegalArgumentException();
		} else {
			this.yearOfBirth = yearOfBirth;
		}
	}

	/**
	 * Requests new patient data.
	 */
	public static Patient requestPatient() {
		String name = requestPatientName();
		int yearOfBirth = requestYearOfBirth();
		Patient result = new Patient(name, yearOfBirth);
		return result;
	}

	/**
	 * Requests patient's name. Ensures patient name is a legible string.
	 */
	public static String requestPatientName() {
		String result = null;
		System.out.print("Please type in the patient's name: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			result = sc.nextLine();
		} else {
			System.out.println("Invalid input, please try again.");
			result = requestPatientName();
		}
		return result;
	}

	/**
	 * Requests patient's yearOfBirth. Ensures entry is an integer.
	 */
	public static int requestYearOfBirth() {
		int result = 0;
		System.out.print("Please type in the patient's year of birth: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			result = sc.nextInt();
		} else {
			System.out.println("Invalid input, please try again.");
			result = requestYearOfBirth();
		}
		return result;
	}

	public static void main(String[] args) {
		List<Patient> myList = new LinkedList<Patient>();
		try {
			myList.add(requestPatient());
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
		}
	}
}