package ExamPreparation.CodingBatExercises.WamUp1;

public class ParrotHour {
    /*
    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    Return true if we are in trouble.
     */

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking == true && (hour > 7 || hour < 20)) {

            System.out.println("Trouble!");
            return true;
        } else {
            System.out.println("no Worries");
            return false;
        }
    }

    public static void main(String[] args) {
        ParrotHour parrotHourClass = new ParrotHour();

        System.out.println(parrotHourClass.parrotTrouble(true,4));

        System.out.println(parrotHourClass.parrotTrouble(false,9));
    }
}
