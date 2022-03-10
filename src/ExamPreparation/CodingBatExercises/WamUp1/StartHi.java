package ExamPreparation.CodingBatExercises.WamUp1;

public class StartHi {
    /*
    Given a string, return true if the string starts with "hi" and false otherwise
     */

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }

        String firsTwo = str.substring(0, 2);

        if (firsTwo.equals("Hi")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StartHi startHiClass = new StartHi();

        System.out.println(startHiClass.startHi("Hi there"));       //true
        System.out.println(startHiClass.startHi("hello there"));    //false
        System.out.println(startHiClass.startHi("so Hi there"));    //false
    }
}
