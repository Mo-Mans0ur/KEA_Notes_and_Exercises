package ExamPreparation.CodingBatExercises.WamUp1;

public class In1020 {

    /*
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public static void main(String[] args) {
        In1020 in1020Class = new In1020();

        System.out.println(in1020Class.in1020(12,21));  //true
        System.out.println(in1020Class.in1020(8,99));   //false

    }
}
