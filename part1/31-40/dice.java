public class dice {
    public static void main( String[] args ) {
        int r1, r2, r3, r4, r5;
        boolean allsame;

        do {
            r1 = 1 + (int)(Math.random() * 6);
            r2 = 1 + (int)(Math.random() * 6);
            r3 = 1 + (int)(Math.random() * 6);
            r4 = 1 + (int)(Math.random() * 6);
            r5 = 1 + (int)(Math.random() * 6);
            System.out.println("You rolled " + r1 + ", " + r2 + ", " + r3 + ", " + r4 + ", " + r5 + ".");
            showdice(r1);
            showdice(r2);
            showdice(r3);
            showdice(r4);
            showdice(r5);
            allsame = ( r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5);
        } while (!allsame);

        System.out.println("The yacht?");
    }
    public static void showdice(int roll) {
        System.out.println("+---+");
        if (roll == 1) {
            System.out.println("|   |");
            System.out.println("| o |");
            System.out.println("|   |");
        }
        else if (roll == 2) {
            System.out.println("|o  |");
            System.out.println("|   |");
            System.out.println("|  o|");
        }
        else if (roll == 3) {
            System.out.println("|o  |");
            System.out.println("| o |");
            System.out.println("|  o|");
        }
        else if (roll == 4) {
            System.out.println("|o o|");
            System.out.println("|   |");
            System.out.println("|o o|");
        }
        else if (roll == 5) {
            System.out.println("|o o|");
            System.out.println("| o |");
            System.out.println("|o o|");
        }
        else if (roll == 6) {
            System.out.println("|ooo|");
            System.out.println("|ooo|");
            System.out.println("|ooo|");
        }
        System.out.println("+---+");
    }
}