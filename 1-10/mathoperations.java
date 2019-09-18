public class mathoperations {
    public static void main( String[] args) {
        int a, b, c, d, e, f, g;
        double x, y, z;
        String one, two, both;

        a = 10;
        b = 27;
        System.out.println("a is" + a + "and b is" + b);

        c = a + b;
        System.out.print("a + b =" + c);
        d = a - b;
        System.out.println("a - b =" + d);
        e = a + b * 3;
        System.out.println("a+ b * 3 =" + e);
        f = b / 2;
        System.out.println("b / 2 =" + f);
        g = b % 10;
        System.out.println("b % 10 =" + g);

        x = 1.1;
        System.out.println("\nx is " + x);
        y = x * x;
        System.out.println("X * x =" + y);
        z = b / 2;
        System.out.println("b / 2 =" + z);
        System.out.println();

        one = "dog";
        two = "house";
        both = one + two;
        System.out.println(both);
    }
}