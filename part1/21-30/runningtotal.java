import java.util.Scanner;

public class runningtotal {
    public static void main ( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int current, total = 0;

        System.out.print("Type in some values and they will be added.");
        System.out.println("Type zero to stop.");

        do {
            System.out.print("Value: ");
            current = keyboard.nextInt();
            total += current;
            System.out.println("The total so far is " + total + ".");
        } while (current != 0);
        System.out.println("Your final total is " + total + ".");
    }
}