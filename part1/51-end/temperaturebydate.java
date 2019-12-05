import java.util.Scanner;

class temperaturesample {
    int month, day, year;
    double temperature;
}

public class temperaturebydate {
    public static void main( String[] args ) throws Exception {
        String site = "https://learnjavathehardway.org";
        String path = "/txt/avg-daily-temps-with-dates-atx.txt";
        Scanner infile = new Scanner((new java.net.URL(site+path)).openStream());

        temperaturesample[] tempdb = new temperaturesample[10000];
        int numrecords, i = 0;

        while (infile.hasNextInt() && i < tempdb.length) {
            temperaturesample e = new temperaturesample();
            e.month = infile.nextInt();
            e.day = infile.nextInt();
            e.year = infile.nextInt();
            e.temperature = infile.nextDouble();
            if (e.temperature == -99) {
                continue;
            }
            tempdb[i] = e;
            i++;
        }
        infile.close();
        numrecords = i;
        System.out.println(numrecords + " daily temperature loaded.");
        double total = 0, avg;
        int count = 0;
        for (i = 0; i < numrecords; i++) {
            if (tempdb[i].month == 11) {
                total += tempdb[i].temperature;
                count++;
            }
        }
        avg = total / count;
        avg = Math.round(avg*10) / 10.0;
        System.out.print("average daily temperature over " + count + " days in november: " + avg);
    }
}