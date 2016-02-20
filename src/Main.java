import java.util.Scanner;

public class Main{
	public static void main(String[] args) { 

		int touchdowns;
		double totalYards;
		int interceptions;
		int completions;
		int attemptedPasses;
		double calcA;
		double calcB;
		double calcC;
		double calcD;
		double passerRating;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of touchdowns");
		touchdowns = input.nextInt();
		System.out.println("Enter total yards");
		totalYards = input.nextInt();
		System.out.println("Enter total interceptions");
		interceptions = input.nextInt();
		System.out.println("Enter total completions");
		completions = input.nextInt();
		System.out.println("Enter attempted passes");
		attemptedPasses = input.nextInt();

		calcA = ((completions/attemptedPasses) - 0.3) * -5;
		calcB = ((totalYards/attemptedPasses) - 3) * .25;
		calcC = ((touchdowns/attemptedPasses) * 20);
		calcD = 2.375 - ((interceptions/attemptedPasses) * 25);

		passerRating = ((calcA + calcB + calcC + calcD)/6)*100;
		System.out.println(calcA + " " + calcB + " " + calcC + " " + calcD);
		System.out.println("Passer's rating: " + passerRating);
	}
}