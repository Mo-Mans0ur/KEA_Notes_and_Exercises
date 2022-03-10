package ExamPreparation.ExamPreparationQuestions;

public class Card {
    private String suit;
    private int value;


    public void beats(int value1, int value2) {

        if (value1 > value2) {
            System.out.println("player 1 wins");
        } else if (value1 < value2) {
            System.out.println("player 2 wins");
        } else if (value1 == value2) {
            System.out.println("its a tie");
        }
    }

    public static void main(String[] args) {
        Card cardClass = new Card();

        cardClass.beats(13,12);
    }
    //awesome but no N. 3
}
