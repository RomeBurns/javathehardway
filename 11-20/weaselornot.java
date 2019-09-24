import java.util.Scanner;

public class weaselornot{
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        boolean yep, nope;

        System.out.println("Type the word\"weasel\" please.");
        word = keyboard.next();

        yep = word.equals("weasel");
        nope = !word.equals("weasel");

        if (yep) {
            System.out.println("You typed what was requested.");
        }
        else {
            System.out.println("You ignored polite instructions");
        }
    }
}