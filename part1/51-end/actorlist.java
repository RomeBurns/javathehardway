import java.util.Scanner;

class actor {
    String name;
    String role;
    String birthdate;
}

public class actorlist {
    public static void main( String[] args ) throws Exception {
        String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
        Scanner infile = new Scanner((new java.net.URL(url)).openStream());
        while (infile.hasNext()) {
            actor a = getactor(infile);
            System.out.println(a.name + " was born on " + a.birthdate + " and played " + a.role + ".");

        }
        infile.close();
    }
    public static actor getactor( Scanner input ) {
        actor a = new actor();
        a.name = input.nextLine();
        a.role = input.nextLine();
        a.birthdate = input.nextLine();

        return a;
    }
}