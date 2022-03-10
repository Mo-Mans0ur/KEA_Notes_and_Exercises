package ExamPreparation.ExamPreparationQuestions;

import java.util.ArrayList;
import java.util.Random;

public class RafleBag {
    private int Dice;

    static Random random = new Random();

    public RafleBag(int dice) {
        Dice = dice;
    }

    public int shake(int dice) {
        int eyes = random.nextInt(6)+1;

        if (dice == 2) {
            return eyes * 2;
        } else {
            return eyes;
        }


    }


    public static void main(String[] args) {
        RafleBag rafleBagClass = new RafleBag(2);

        System.out.println(rafleBagClass.shake(rafleBagClass.Dice));


    }// amazing done but no N. 3
}
