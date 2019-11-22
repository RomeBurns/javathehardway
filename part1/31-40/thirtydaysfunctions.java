import java.util.Scanner;

public class thirtydaysfunctions {
    public static void main ( String[] args ) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Which month? (1-12): ");
        int month = kb.nextInt();

        System.out.println(monthdays(month) + " days hath " + monthname(month));
    }
    public static String monthname(int month) {
        String monthname;
        switch(month) {
            case 1: monthname = "January";
                    break;
            case 2: monthname = "February";
                    break;
            case 3: monthname = "March";
                    break;
            case 4: monthname = "April";
                    break;
            case 5: monthname = "May";
                    break;
            case 6: monthname = "June";
                    break;
            case 7: monthname = "July";
                    break;
            case 8: monthname = "August";
                    break;
            case 9: monthname = "September";
                    break;
            case 10: monthname = "October";
                    break;
            case 11: monthname = "November";
                    break;
            case 12: monthname = "December";
                    break;
            default: monthname = "No";
        }
        return monthname;
    }
    public static int monthdays(int month) {
        int days;
        switch(month) {
            case 9:
            case 4:
            case 6:
            case 11: days = 30;
                    break;
            case 2: days = 28;
                    break;
            default: days = 31;
        }
        return days;
    }
}