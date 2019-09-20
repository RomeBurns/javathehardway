import java.util.Scanner;

public class sequencing{
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double price = 0, salestax, total;

        System.out.println("How much is the purchase price?");
        price = keyboard.nextDouble();

        salestax = price * 0.0825;
        total = price + salestax;

        System.out.println("Item price: " + price);
        System.out.println("Sales Tax: " + salestax);
        System.out.println("Total due: " + total);
    }
}