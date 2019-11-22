import java.util.Scanner;

public class comparingnumbers {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double first, second;

        System.out.println("Give me two numbers, first one: ");
        first = keyboard.nextDouble();
        System.out.println("Second: ");
        second = keyboard.nextDouble();

        if (first < second) {
            System.out.println(first + " is less than " + second);
        }
        if (first <= second) {
            System.out.println(first + " is less than or equal to " + second);
        }
        if (first == second) {
            System.out.println(first + " is equal to " + second);
        }
        if (first >= second) {
            System.out.println(first + " is greater than or equal to " + second);
        }
        if (first > second) {
            System.out.println(first + " is greater than " + second);
        }
        if (first != second) {
            System.out.println(first + " is not equal to " + second);
        }
    }
}