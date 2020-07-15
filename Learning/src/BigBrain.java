import java.util.Scanner;

public class BigBrain {

	public static void main(String[] args) {
		String password = "pineapple pizza";
		
		Scanner scanner = new Scanner(System.in);
		String guess;
		
		do {
			
			System.out.println("What's the password:");
			guess = scanner.nextLine();
			
		} while (!guess.equals(password));

		System.out.println("You are correct!");
		scanner.close();
		
		
	}

}