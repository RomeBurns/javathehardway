import java.io.File;
import java.util.Scanner;

public class gettingwholefile {
    public static void main( String[] args ) throws Exception {
        int fourletter = 0;
        int caps = 0;
        String fn1 = "words.txt";
        String fn2 = "gettingwholefile.java";

        Scanner wordReadr = new Scanner( new File(fn1));

        while (wordReadr.hasNext()) {
            String w =wordReadr.next();
            if ( w.length() == 4) {
                fourletter++;
            }
        }
        wordReadr.close();

        Scanner selfInput = new Scanner(new File(fn2));
        while (selfInput.hasNext()) {
            String token = selfInput.next();
            if ( Character.isUpperCase( token.charAt(0) ) ) {
                caps++;
            }
        }
        selfInput.close();

        System.out.println(fourletter + " four letter words in " + fn1);
        System.out.println(caps + " capital letters in " + fn2);
    }
}