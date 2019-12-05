public class arrayslotaccess {
    public static void main( String[] args ) {
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int)(Math.random()*100);
        }
        System.out.print("Values: ");
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr[0] = 6;
        arr[1] = 7;
        arr[2] = 8;

        System.out.println("Values: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        arr[0] = (int)(Math.random()*100);
        arr[1] = (int)(Math.random()*100);
        arr[2] = (int)(Math.random()*100);

        System.out.println("Values: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        int m = 0;
        arr[m] = (int)(Math.random()*100);
        m = 1;
        arr[m] = (int)(Math.random()*100);
        m = 2;
        arr[m] = (int)(Math.random()*100);
        System.out.println("Values: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        int n = 0;
        arr[n] = (int)(Math.random()*100);
        n++;
        arr[n] = (int)(Math.random()*100);
        n++;
        arr[n] = (int)(Math.random()*100);
        System.out.println("Values: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        for (int q = 0; q < arr.length; q++) {
            arr[q] = 1 + (int)(Math.random()*100);
        }
        System.out.print("Values: ");
        for (int q = 0; q < arr.length; q++) {
            System.out.print(arr[q] + " ");
        }
        System.out.println();
    }
}