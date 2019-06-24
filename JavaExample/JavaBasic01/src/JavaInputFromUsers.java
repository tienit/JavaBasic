import java.util.Scanner;

public class JavaInputFromUsers {


	private static Scanner scanner;

	public static void main1(String[] args) {
		
		scanner = new Scanner(System.in);
		
		// Get string from user
		System.out.print("Enter your name: ");
		String strInput = scanner.next();
		System.out.println("Hello " + strInput);
		
		// Get integer from user
		System.out.print("Enter you number: ");
		int iInput = scanner.nextInt();
		System.out.println("Your number is " + iInput);
		
	}
}
