public class nestingloops {
    public static void main( String[] args ) {
        for ( char c = 'A'; c <= 'E'; c++) {
            for ( int n = 1; n <= 3; n++) {
                System.out.println(c + " " + n);
            }
        }
        System.out.println("\n");

        for ( int c = 1; c <= 3; c++) {
            for ( int n = 1; n <= 3; n++) {
                System.out.print("(" + c + " " + n + ")");
            }
        }
    }
}