import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class coinflipsaved {
    public static void main( String[] args ) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String coin, again, bestname, savefilename = "coin-flip-score.txt";
        int streak = 0, best;
        boolean gotheads;

        File f = new File(savefilename);
        if (f.exists() && f.length() > 0) {
            Scanner input = new Scanner(f);
                bestname = input.next();
                best = input.nextInt();
            input.close();
            System.out.print("High score is " + best);
            System.out.println(" flips in a row by " + bestname);
        }
        else {
            System.out.println("Save game file does not exist or it is empty.");
            best = -1;
            bestname = "";
        }

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

        System.out.println("Final score is " + streak);

        if (streak > best) {
            System.out.println("Give us the name of the player whpo has just gotten the new highscore(you): ");
            bestname = keyboard.next();
            best = streak;
        }
        else if (streak == best) {
            System.out.println("That ties the highscore, but you don't get your name on the leaderboard.");
        }
        else {
            System.out.println("You\'ll have to do better than " + best + " if you want the highscore.");
        }

        PrintWriter out = new PrintWriter(f);
            out.println(bestname);
            out.println(best);
        out.close();
    }
}