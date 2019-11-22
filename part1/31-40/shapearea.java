import java.util.Scanner;

public class shapearea {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        double area = 0;

        System.out.println("Shape area calculator, please use integers only.");

        do {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.println("1)Triangle");
            System.out.println("2)Circle");
            System.out.println("2)Rectangle");
            System.out.println("4)Quit");
            System.out.print("> ");
            choice = keyboard.nextInt();

            if (choice == 1) {
                System.out.print("\nBase: ");
                int b = keyboard.nextInt();
                System.out.print("Height: ");
                int h = keyboard.nextInt();
                area = computetriangle(b, h);
                System.out.println("Area: " + area);
            }
            else if (choice == 2) {
                System.out.print("\nRadius: ");
                int r = keyboard.nextInt();
                area = computecircle(r);
                System.out.println("Area: " + area);
            }
            else if (choice == 3) {
                System.out.print("\nLength: ");
                int l = keyboard.nextInt();
                System.out.print("Width: ");
                int w = keyboard.nextInt();
                area = computerectangle(l, w);
                System.out.println("Area: " + area);
            }
        } while (choice != 4);
    }
    public static double computetriangle(int b, int h) {
        double A;
        A = 0.5 * b * h;
        return A;
    }
    public static double computecircle(int r) {
        double A;
        A = Math.PI * r * r;
        return A;
    }
    public static double computerectangle(int l , int w) {
        double A;
        A = l * w;
        return A;
    }
}