import java.util.Scanner;

public class highlow {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(100*Math.random());

        System.out.print("I'm thinking of a number between 1- 100.\nTry to guess it: ");
        guess = keyboard.nextInt();

        while (secret != guess) {
            if (guess < secret) {
                System.out.println("Your guess is too low, try again");
                guess = keyboard.nextInt();
            }
            if (guess > secret) {
                System.out.println("Your guess is too high, try again");
                guess = keyboard.nextInt();
            }
        }
        System.out.println("You guessed it.");
    }
}