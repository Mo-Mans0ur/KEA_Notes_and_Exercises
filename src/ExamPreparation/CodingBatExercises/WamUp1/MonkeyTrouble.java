package ExamPreparation.CodingBatExercises.WamUp1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmiles, boolean bSmiles) {
        if (aSmiles || bSmiles) {
            System.out.println("Oh shit");
            return true;
        } else if (!aSmiles || !bSmiles) {
            System.out.println("oh shit");
            return true;
        }
        System.out.println("all good");
        return false;
    }

    public static void main(String[] args) {
        MonkeyTrouble monkeyTroubleClass = new MonkeyTrouble();

        System.out.println(monkeyTroubleClass.monkeyTrouble(true, true));
        System.out.println(monkeyTroubleClass.monkeyTrouble(true, false));
    }
}
