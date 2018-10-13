import java.util.Random;
import java.util.Scanner;


public class DiceRoll {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides should each die have?");
		DiceRoll dice = new DiceRoll(scan.nextInt());
	    System.out.println("\nThe dice rolled a " + dice.roll() + ".");

	}
   
	final Random rand;
	final int dSides;
	
	public DiceRoll(int dSides) {
		this.rand = new Random();
		this.dSides = dSides;
	}

	public int roll() {
		return 1 + rand.nextInt(dSides);
	}	
	

}