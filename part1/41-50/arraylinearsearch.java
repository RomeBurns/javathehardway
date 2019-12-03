import java.util.Scanner;

public class arraylinearsearch {
    public static void main( String[] args ) {
        Scanner keyboard =  new Scanner(System.in);
        int[] ordernumbers = {2134,2456,4578,1545,2355,9876};
        int tofind;

        System.out.println("There are " + ordernumbers.length + " orders in the database.");

        System.out.print("Orders: ");
        for (int num : ordernumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Which order to find? ");
        tofind = keyboard.nextInt();

        for (int num : ordernumbers) {
            if (num == tofind) {
                System.out.println(num + " found.");
            }
        }
    }
}