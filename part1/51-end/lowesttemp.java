import java.net.URL;
import java.util.Scanner;

public class lowesttemp {
    public static void main( String[] args ) throws Exception{
        String urlbase = "https://learnjavathehardway.org/txt/";
        double[] temps = arrayFromUrl(urlbase + "avg-daily-temps-atx.txt");
        System.out.println(temps.length + " temperatures in database.");
        double lowest = 9999.99;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < lowest) {
                lowest = temps[i];
            }
        }
        System.out.println("The lowest average daily temperature was " + lowest + " fahrenheit, " + fToC(lowest) + " celsius.");
    }
    public static double[] arrayFromUrl( String url ) throws Exception {
        Scanner fin = new Scanner((new URL(url)).openStream());
        int count = fin.nextInt();

        double[] dubs = new double[count];

        for (int i = 0; i < dubs.length; i++) {
            dubs[i] = fin.nextDouble();
        }
        fin.close();

        return dubs;
    }
    public static double fToC( double f ) {
        return (f - 32) * 5 / 9;
    }
}