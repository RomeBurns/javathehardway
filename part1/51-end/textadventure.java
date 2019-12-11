import java.util.Scanner;

class room {
    int roomnumber;
    String roomname;
    String description;
    int numexits;
    String[] exits = new String[10];
    int[] destinations = new int[10];
}

public class textadventure {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        room[] rooms = loadroomsfromfile("text-adventure-rooms.txt");
        int currentroom = 0;
        String ans;
        while (currentroom >= 0) {
            room cur = rooms[currentroom];
            System.out.print(cur.description + "> ");
            ans = keyboard.nextLine();
            boolean found = false;
            for (int i = 0; i < cur.numexits; i++) {
                if (cur.exits[i].equals(ans)) {
                    currentroom = cur.destinations[i];
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Sory, I don't understand.");
            }
        }
    }
    public static room[] loadroomsfromfile( String filename ) {
        Scanner file = null;
        try {
            file = new Scanner(new java.io.File(filename));
        }
        catch (java.io.IOException e) {
            System.err.println("can't open " + filename + " for reading.");
            System.exit(1);
        }
        int numrooms = file.nextInt();
        room[] rooms = new room[numrooms];
        int roomnum = 0;
        while (file.hasNext()) {
            room r = getroom(file);
            if (r.roomnumber != roomnum) {
                System.err.print("just read room number " + r.roomnumber);
                System.err.println("but room number " + roomnum + " was expected.");
                System.exit(2);
            }
            rooms[roomnum] = r;
            roomnum++;
        }
        file.close();
        return rooms;
    }
    public static void showallrooms( room[] rooms ) {
        for (room r : rooms) {
            String exitstring = "";
            for (int i = 0; i < r.numexits; i++) {
                exitstring += "\t" + r.exits[i] + "(" + r.destinations[i] + ")";
            }
            System.out.println(r.roomnumber + ")" + r.roomname);
            System.out.println(exitstring);
        }
    }
    public static room getroom( Scanner f ) {
        if ( !f.hasNextInt()) {
            return null;
        }
        room r = new room();
        String line;
        r.roomnumber = f.nextInt();
        f.nextLine();
        r.roomname = f.nextLine();
        r.description = "";
        while (true) {
            line = f.nextLine();
            if (line.equals("%%")) {
                break;
            }
            r.description += line + "\n";
        }
        int i = 0;
        while (true) {
            line = f.nextLine();
            if (line.equals("%%")) {
                break;
            }
            String[] parts = line.split(":");
            r.exits[i] = parts[0];
            r.destinations[i] = Integer.parseInt(parts[1]);
            i++;
        }
        r.numexits = i;
        return r;
    }
}