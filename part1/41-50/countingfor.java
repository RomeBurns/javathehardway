import java.util.Scanner;
public class countingfor {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        String message;

        System.out.println("enter a mesaage and i will display it five times.");
        System.out.println("Message: ");
        message = keyboard.nextLine();

        for (n = 1; n <= 5; n++) {
            System.out.println(n + "." + message);
        }

        System.out.println("we will now show it ten times and count by five.");
        for (n = 5; n <= 50; n += 5) {
            System.out.println(n + "." + message);
        }

        System.out.println("Finnally, three times counting backwards");
        for (n = 3; n > 0; n -= 1) {
            System.out.println(n + "." + message);
        }
    }
}