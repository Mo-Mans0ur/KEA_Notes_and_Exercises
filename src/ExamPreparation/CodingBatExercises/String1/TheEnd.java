package ExamPreparation.CodingBatExercises.String1;

public class TheEnd {
    /*
    Given a string, return a string length 1 from its front, unless front is false,
    in which case return a string length 1 from its back. The string will be non-empty.
     */
    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public static void main(String[] args) {
        TheEnd theEndClass  = new TheEnd();

        System.out.println(theEndClass.theEnd("Hello",true));   //H
        System.out.println(theEndClass.theEnd("Hello",false));  //o
    }
}
