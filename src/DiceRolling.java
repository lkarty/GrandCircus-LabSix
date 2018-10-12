import java.util.Random;

public class DiceRolling {
	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);

	}

	public static int jdiceRand(int randD1) {
		Random randGen = new Random();
		int seedVal;

		seedVal = 59;
		randGen.setSeed(seedVal);

		/* Your solution goes here */
		int a = randGen.nextInt(10);
		int b = randGen.nextInt(10);
		return randD1;

	}

	public static int jdiceRand2(int randD2) {
		return randD2;

	}
}