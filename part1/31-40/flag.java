import static java.lang.System.*;

public class flag {
    public static void main( String[] args ) {
        tophalf();
        p48colons();
        p48ohs();
        p48colons();
        p48ohs();
        p48colons();
        p48ohs();
        out.println( " ________________________________________________" );
    }
    public static void p48colons() {
        out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
    }
    public static void p48ohs() {
        out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
    }
    public static void p29colons() {
        out.println( "|:::::::::::::::::::::::::::::|" );
    }
    public static void p29ohs() {
        out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
    }
    public static void sixstar() {
        out.print("| *  *  *  *  *  * ");
    }
    public static void fivestar() {
        out.print("|   *  *  *  *  *  ");
    }
    public static void sixline() {
        sixstar();
        p29ohs();
    }
    public static void fiveline() {
        fivestar();
        p29colons();
    }
    public static void tophalf() {
        out.println( " ________________________________________________" );
        sixline();
        fiveline();
        sixline();
        fiveline();
        sixline();
        fiveline();
        sixline();
    }
}