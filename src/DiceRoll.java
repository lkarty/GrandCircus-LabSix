import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
	static int rand1, rand2, dSides;
	static String usrContinue;

	private static void rollDice(Random randroll, Scanner userInput) {
		do {
			rand1 = randroll.nextInt(dSides) + 1;
			rand2 = randroll.nextInt(dSides) + 1;
			System.out.println("Result:\n\t" + rand1 + "\n\t" + rand2);
			if ((rand1 + rand2) == 1) {
				System.out.println("\tSnake eyes");
			} else if ((rand1 + rand2) == 7) {
				System.out.println("\tCraps");
			} else if ((rand1 + rand2) == 12) {
				System.out.println("\tBox cars");
			}
			System.out.println("Roll again?(y/n): ");
			usrContinue = userInput.next();
			userInput.nextLine();
		} while (usrContinue.equalsIgnoreCase("y"));
	}

	public static void main(String[] args) {
		Random randroll = new Random();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("How many dSides should each die have?): ");
		dSides = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Roll the dice?(y/n): ");
		usrContinue = userInput.next();
		userInput.nextLine();
		rollDice(randroll, userInput);
		System.out.println("Goodbye");
		userInput.close();
	}

}