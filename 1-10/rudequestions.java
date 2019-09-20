import java.util.Scanner;
import java.lang.Math;

public class rudequestions {
    public static void main( String[] args ) {
        String name;
        int age;
        int weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        name = keyboard.next();

        System.out.println("Hi " + name + "! how old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + " eh?, That's not very old.");
        System.out.println("How much do you weigh, " + name + "?");
        weight = keyboard.nextInt();

        System.out.println(weight + "! Better keep that quite.");
        System.out.println("Finally, what's your income " + name +"?");
        income = keyboard.nextInt();

        System.out.println("Hopefully that is " + income + " per hour,");
        System.out.println(" and not per year");
        System.out.println("Thanks for answerng my rude questions, " + name + ".");
    }
}