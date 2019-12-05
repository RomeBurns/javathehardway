class student {
    String name;
    int credits;
    double gpa;
}

public class studentdatabase {
    public static void main( String[] args ) {
        student[] db;
        db = new student[3];

        db[0] = new student();
        db[0].name = "estoban";
        db[0].credits = 43;
        db[0].gpa = 2.9;

        db[1] = new student();
        db[1].name = "dave";
        db[1].credits = 15;
        db[1].gpa = 4.0;

        db[2] = new student();
        db[2].name = "michelle";
        db[2].credits = 132;
        db[2].gpa = 3.72;

        for (int i = 0; i < db.length; i++) {
            System.out.println("name: " + db[i].name + "\n\tcredit hours: " + db[i].credits + "\n\tGPA: " + db[i].gpa);
        }
        int maxloc = 0;
        for (int i = 0; i < db.length; i++) {
            if (db[i].gpa > db[maxloc].gpa) {
                maxloc = i;
            }
        }
        System.out.println(db[maxloc].name + " has the highest gpa.");
    }
}