public class heronsformula {
    public static void main( String[] args ) {
        double a, g;
        String tws = "triangle with sides";

        a = trianglearea(3, 3, 3);
        System.out.println("A triangle with sides 3, 3, 3 has area: " + a);

        a = trianglearea(3, 4, 5);
        System.out.println("A triangle with sides 3, 4, 5 has area: " + a);
        g = trianglearea(7, 8, 9);
        System.out.println(tws + "7, 8, 9 has area: " + g);

        System.out.println(tws + "5, 12, 13 has area: " + trianglearea(5, 12, 13));
        System.out.println(tws + "10, 9, 11 has area: " + trianglearea(10, 9, 11));
        System.out.println(tws + "8, 15, 17 has area: " + trianglearea(8, 15, 17));
    }
    public static double trianglearea( int a, int b, int c) {
        double s, A;

        s = (a + b + c) / 2;
        A = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return A;
    }
}