public class clubbouncer {
    public static void main( String[] args ) {
        int age = 22;
        boolean onguestlist = false;
        double allure = 7.5;
        String gender = "F";

        if (onguestlist || age >= 21 || (gender.equals("F") && allure >= 8)) {
            System.out.println("You are allowed to enter the club.");
        }
        else {
            System.out.println("You are not allowed to enter the club.");
        }
    }
}