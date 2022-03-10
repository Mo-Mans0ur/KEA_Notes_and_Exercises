package ExamPreparation.CodingBatExercises.String1;

public class MiddleTwo {
    /*
     Given a string of even length, return a string made of the middle two chars,
     so the string "string" yields "ri".The string length will be at least 2.
     */
    public String middleTwo(String str) {
        int half = str.length() / 2;
        return str.substring(half - 1, half + 1);
    }

    public static void main(String[] args) {
        MiddleTwo middleTwoClass = new MiddleTwo();

        System.out.println(middleTwoClass.middleTwo("String"));     //ri
        System.out.println(middleTwoClass.middleTwo("Code"));       //od

    }
}
