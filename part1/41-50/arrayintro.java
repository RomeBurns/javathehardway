public class arrayintro {
    public static void main( String[] args ) {
        String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};

        for (String p : planets) {
            System.out.println(p + "\t" + p.toUpperCase());
        }
    }
}