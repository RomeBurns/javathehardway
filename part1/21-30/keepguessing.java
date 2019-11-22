import java.util.Scanner;

public class keepguessing {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(10*Math.random());

        System.out.print("I have chosen a number between one and ten\nTry to guess it:        ");
        guess = keyboard.nextInt();

        while (secret != guess) {
            System.out.println("Your guess is incorrect\nguess again:  ");
            guess = keyboard.nextInt();
        }

        System.out.println("Correct");
    }
}
//I fixed it because I could