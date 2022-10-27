import java.util.HashMap;

public class Cards {
    private HashMap<Card, Integer> cards;
    private int diamonds;
    private int hearts;
    private int clubs;
    private int spades;

    public Cards() {
        this.cards = new HashMap<>();
        fillCards();
        this.diamonds = 104;
        this.clubs = 104;
        this.spades = 104;
        this.hearts = 104;
    }

    public int getSpades() {
        return spades;
    }

    public int getClubs() {
        return clubs;
    }
    public int getHearts() {
        return hearts;
    }
    public int getDiamonds() {
        return diamonds;
    }
    public int getCurrentSize() {
        int amount = 0;
        for (Card key : cards.keySet()) {
            amount += cards.get(key);
        }
        return amount;
    }

    private void fillCards() {
        fillSuitCards("Diamonds");
        fillSuitCards("Clubs");
        fillSuitCards("Hearts");
        fillSuitCards("Spades");
    }

    private void fillSuitCards(String suit) {
        cards.put(new Card(suit, "A"), 8);
        cards.put(new Card(suit, "K"), 8);
        cards.put(new Card(suit, "Q"), 8);
        cards.put(new Card(suit, "J"), 8);
        cards.put(new Card(suit, "10"), 8);
        cards.put(new Card(suit, "9"), 8);
        cards.put(new Card(suit, "8"), 8);
        cards.put(new Card(suit, "7"), 8);
        cards.put(new Card(suit, "6"), 8);
        cards.put(new Card(suit, "5"), 8);
        cards.put(new Card(suit, "4"), 8);
        cards.put(new Card(suit, "3"), 8);
        cards.put(new Card(suit, "2"), 8);
    }

    public class Card {
        String cardSuit;
        String cardValue;

        public Card(String cardSuit, String cardValue) {
            this.cardSuit = cardSuit;
            this.cardValue = cardValue;
        }

        public String getCardSuit() {
            return cardSuit;
        }

        public String getCardValue() {
            return cardValue;
        }

    }
}
