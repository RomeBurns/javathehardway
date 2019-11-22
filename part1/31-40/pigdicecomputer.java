public class pigdicecomputer {
    public static void main( String[] args ) {
        int roll, total;
        total = 0;

        do {
            roll = 1 + (int)(Math.random() * 6);
            System.out.println("Computer rolled : " + roll);
            if (roll == 1) {
                System.out.println("That ends its turn.");
                total = 0;
            }
            else {
                total += roll;
                System.out.print("Computer has : " + roll + "\npoints this round");
                if (total < 20) {
                    System.out.println("\tComputer will roll again.");
                }
            }

        } while (roll != 1 && total < 20);
        System.out.println("Computer ends the round with " + roll + " points.");
    }
}