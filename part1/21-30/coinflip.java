import java.util.Scanner;

public class coinflip {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String coin, again;
        int streak = 0;
        boolean gotheads;

        do {
            gotheads = Math.random() < 0.5;

            if (gotheads) {
                coin = "heads";
            }
            else {
                coin = "tails";
            }
            System.out.println("You flip a coin and it lands on " + coin + ".");

            if (gotheads) {
                streak++;
                System.out.println("\tThat is " + streak + " in a row!");
                System.out.println("\tWould you like to flip again?(y/n)");
                again = keyboard.next();
            }
            else {
                System.out.println("You have just lost yur streak.");
                streak = 0;
                again = "n";
            }
        } while (again.equals("y"));

        System.out.println("Final score : " + streak);
    }
}