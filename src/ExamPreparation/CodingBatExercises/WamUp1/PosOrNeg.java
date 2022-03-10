package ExamPreparation.CodingBatExercises.WamUp1;

public class PosOrNeg {
    /*
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
     */
    public boolean posOrNeg(int a, int b, boolean negative) {
        if  (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public static void main(String[] args) {
        PosOrNeg posOrNegClass = new PosOrNeg();

        System.out.println(posOrNegClass.posOrNeg(1, -4, true));    //true
        System.out.println(posOrNegClass.posOrNeg(1, 4, false));    //false
        System.out.println(posOrNegClass.posOrNeg(-5, -4, true));   //true
        System.out.println(posOrNegClass.posOrNeg(8,3,true));       //false
    }
}
