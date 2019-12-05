class card {
    int value;
    String suit;
    String name;

    public String tostring() {
        return name + " of " + suit;
    }
}

public class pickacard {
    public static void main( String[] args ) {
        card[] deck = buildDeck();
        int chosen = (int)(Math.random()*deck.length);
        card picked = deck[chosen];
        System.out.println("You picked a " + picked + " out of the deck.\nworth " + picked.value + " points in blackjack.");
    }
    public static card[] buildDeck() {
        String[] suits = {"clubs", "diamonds", "spades", "hearts"};
        String[] names = { "ZERO", "ONE", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace" };
        int i = 0;
        card[] deck = new card[52];
        for (String s : suits) {
            for (int v = 2; v <= 14; v++) {
                card c = new card();
                c.suit = s;
                c.name = names[v];
                if (v == 14) {
                    c.value = 11;
                }
                else if (v > 10) {
                    c.value = 10;
                }
                else {
                    c.value = v;
                }
                deck[i] = c;
                i++;
            }
        }
        return deck;
    }
    public static void displaydeck( card[] deck ) {
        for (card c : deck) {
            System.out.println(c.value + "/t" + c);
        }
    }
}