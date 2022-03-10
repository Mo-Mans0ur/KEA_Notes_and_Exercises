package ExamPreparation.CodingBatExercises.WarmUp2;

public class StringX {
    /*
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.
     */

    public String stringX(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringX stringXClass = new StringX();

        System.out.println(stringXClass.stringX("xxhxixx")); //xhix
        System.out.println(stringXClass.stringX("xxxxBusxxxxx"));   //xBusx
    }
}
