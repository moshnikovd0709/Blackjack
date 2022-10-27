public class Main {

    public static void main(String[] args) {
        Cards cards = new Cards();
        System.out.println(getProbabilityOfFlash(cards));
    }

    public static double getProbabilityOfFlash(Cards cards) {
        double x = 0;
        x += getColorProbability(cards.getClubs(), cards);
        x += getColorProbability(cards.getDiamonds(), cards);
        x += getColorProbability(cards.getHearts(), cards);
        x += getColorProbability(cards.getSpades(), cards);
        return x;
    }

    private static double getColorProbability(int colorAmount, Cards cards) {
        double cur = colorAmount * (colorAmount - 1) * (colorAmount - 2);
        cur /= (cards.getCurrentSize() * (cards.getCurrentSize() - 1) * (cards.getCurrentSize() - 2));
        return cur;
    }


}
