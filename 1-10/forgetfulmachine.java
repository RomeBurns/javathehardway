import java.util.Scanner;

public class forgetfulmachine {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France?");
        keyboard.next();

        System.out.println("What is 6 times seven?");
        keyboard.nextInt();

        System.out.println("enter a number between 0.0 and 1.0:");
        keyboard.nextDouble();

        System.out.println("Is there anything else you woluld like to say?");
        keyboard.next();
    }
}