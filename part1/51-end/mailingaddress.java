class address {
    String street;
    String city;
    String state;
    int zip;
}

public class mailingaddress {
    public static void main( String[] args ) {
        address uno, dos, tres;

        uno = new address();
        uno.street = "191 marigold lane";
        uno.city = "miami";
        uno.state = "florida";
        uno.zip = 33179;

        dos = new address();
        dos.street = "3029 losh lane";
        dos.city = "crafton";
        dos.state = "pensylvania";
        dos.zip = 28601;

        tres = new address();
        tres.street = "2693 hannah street";
        tres.city = "hickory";
        tres.state = "north carolina";
        tres.zip =28601;

        System.out.println(uno.street);
        System.out.println(uno.city + ", " + uno.state + ", " + uno.zip);
        System.out.println(dos.street);
        System.out.println(dos.city + ", " + dos.state + ", " + dos.zip);
        System.out.println(tres.street);
        System.out.println(tres.city + ", " + tres.state + ", " + tres.zip);
    }
}