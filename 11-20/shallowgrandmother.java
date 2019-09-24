import java.util.Scanner;

public class shallowgrandmother {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        double income, cute;
        boolean allowed;

        System.out.print("Enter your age: ");
        age = keyboard.nextInt();

        System.out.print("Enter your yearly income: ");
        income = keyboard.nextDouble();

        System.out.print("How cute are you on a scale of one through ten: ");
        cute = keyboard.nextDouble();

        allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );
        if (allowed) {
            System.out.println("You are allowed to date my grandchild.");
        }
        else {
            System.out.println("You are not allowed to date my grandchild.");
        }
    }
}