package ExamPreparation.CodingBatExercises.WamUp1;

public class SleepIn {
    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday, or we're on vacation.
    Return true if we sleep in.
     */

    public static void main(String[] args) {


        System.out.println(SleepIn.sleepIn(false, true));

        System.out.println(sleepIn(false, false));

        System.out.println(sleepIn(true, false));

    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("sleep in ZZzZZzZZzZZ");
            return true;
        } else {
            System.out.println("up an at them");
            return false;
        }



    }
}
