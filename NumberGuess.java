/*
Write a program that generates a random number between 0 and 100 and asks the user to guess it.
The user can have at maximum 10 trials. If the number is guessed, the user should be asked if she
he wants to play again. If the number is not guessed and 10 trials were used, the user is not
lucky, the program should terminate with a proper message.

Written By MOHAMMAD EL KASWANI
*/
import java.util.*;
  public class NumberGuess{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Random rand = new Random();
		 int secret = rand.nextInt(100);
		 int numOfGuesses = 10;
		 int noOfWins = 0;
		
		 while (true) {
			int guesses = 0;
			boolean isGuessed = false;
			while (guesses <= numOfGuesses) {
			System.out.print("Enter number between 0 to 100: ");
			int num = sc.nextInt();
			guesses++;
		if(num == secret){
			isGuessed = true;
			noOfWins++;
			System.out.println("You guessed it in "+guesses+" tries.");
			break;
		}else if(num > secret){
		     System.out.println("Enter low number");
		}else{
			  System.out.println("Enter high number");
		}
		}
		sc.nextLine();
		if(!isGuessed){
			  System.out.println("Better luck next time.");
		}
			  System.out.print("\nDo you want to play again? (Y/N): ");
			  String s = sc.nextLine();
			  if(s.toLowerCase().equals("n"))
					break;
			  secret = rand.nextInt(100);
		 }
		 System.out.println("\nYou won in "+noOfWins+" games");
	}
}

