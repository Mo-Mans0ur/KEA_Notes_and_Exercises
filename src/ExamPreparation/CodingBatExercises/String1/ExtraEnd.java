package ExamPreparation.CodingBatExercises.String1;

public class ExtraEnd {

    /*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
     */

    public String extraEnd(String str) {
        String triple = str.substring(str.length()-2,str.length());
        return triple+triple+triple;
    }

    public static void main(String[] args) {
        ExtraEnd extraEndClass = new ExtraEnd();

        System.out.println(extraEndClass.extraEnd("Hello"));    //lololo
        System.out.println(extraEndClass.extraEnd("ab"));       //ababab
    }
}
