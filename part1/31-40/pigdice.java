import java.util.Scanner;

public class pigdice {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int roll, ctot, ptot, turntotal;
        String choice = "";

        ptot = 0;
        ctot = 0;

        do {
            turntotal = 0;
            System.out.println("You have " + ptot + " points.");

            do {
                roll = 1 + (int)(Math.random() * 6);
                System.out.println("You rolled: " + roll);
                if (roll == 1) {
                    System.out.println("That ends your turn.");
                    turntotal = 0;
                }
                else {
                    turntotal += roll;
                    System.out.print("\tyou have " + turntotal + " points so far this round\n\twould you like to roll again or hold. Type either roll or hold.");
                    choice = keyboard.next();
                }
            } while (roll != 1 && choice.equals("roll"));

            ptot += turntotal;
            System.out.println("You end the round with " + ptot + " points.");

            if (ptot < 100) {
                turntotal = 0;
                System.out.println("Computer has  " + ctot + " points.");

                do {
                    roll = 1 + (int)(Math.random() * 6);
                    System.out.println("Computer has rolled " + roll);
                    if (roll == 1) {
                        System.out.println("That ends its turn.");
                        turntotal = 0;
                    }
                    else {
                        turntotal += roll;
                        System.out.println("Computer has " + turntotal + " points so far.");
                        if (turntotal < 20) {
                            System.out.println("Computer will roll again.");
                        }
                    }
                } while (roll != 1 && turntotal < 20);
                ctot += turntotal;
                System.out.println("Computer ends the round with " + ctot + " points.");
            }
        } while (ptot < 100 && ctot < 100);
        if (ptot > ctot) {
            System.out.println("Player winds");
        }
        else {
            System.out.println("The computer wins.");
        }
    }
}