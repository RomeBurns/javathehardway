public class escapesequencescomments{
    public static void main( String[] args ){
        // This exercise demonstrates escape sequences and comments
        System.out.println( "Learn\tJava\n\tThe\nHard\tWay\n\n" );
        System.out.println( "\tLearn Java The \"Hard\" Way!\n" );
        //System.out.frimp( "Learn Java The Hard Way" );
        System.out.println( "Hello1\n" ); //This line prints hello.
        System.out.println( "Jello\by\n" ); //This line prints jelly.
        /* The quick brown fox jumped over a lazy dog.
        Quick wafting zephyrs vex bold Jim. */
        System.out /*testing*/ .println( "Hard to believe, eh?" );
        System.out.println( "Surprised, /*abcde*/ or what did you expect?");
        System.out.println( "\\ // -=- \\ //");
        System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); //it takes 2 to make 1.
        System.out.println( "I hope you understand \"escape sequences\" now." );
        // and comments
    }
}