import java.util.Scanner;

public class booleanexpressions {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        boolean a, b, c, d, e, f;
        double x, y;

        System.out.print("Give me two numbers. First: ");
        x = keyboard.nextDouble();
        System.out.print("Give me the second number: ");
        y = keyboard.nextDouble();

        a = (x < y);
        b = (x <= y);
        c = (x == y);
        d = (x != y);
        e = (x > y);
        f = (x >= y);

        System.out.println(x + "is less than" + y + ":" + a);
        System.out.println(x + "is less than or equal to" + y + ":" + b);
        System.out.println(x + "is equal to" + y + ":" + c);
        System.out.println(x + "is not equal to" + y + ":" + d);
        System.out.println(x + "is greater than" + y + ":" + e);
        System.out.println(x + "is greater than or equal to" + y + ":" + f);
        System.out.println();

        System.out.println( !(x < y) + " " + (x >= y) );
        System.out.println( !(x <= y) + " " + (x > y) );
        System.out.println( !(x == y) + " " + (x != y) );
        System.out.println( !(x != y) + " " + (x == y) );
        System.out.println( !(x > y) + " " + (x <= y) );
        System.out.println( !(x >= y) + " " + (x < y) );
    }
}