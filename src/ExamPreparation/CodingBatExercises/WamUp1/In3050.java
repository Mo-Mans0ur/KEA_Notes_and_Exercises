package ExamPreparation.CodingBatExercises.WamUp1;

public class In3050 {

    /*
    Given 2 int values, return true if they are both in the range 30..40 inclusive,
    or they are both in the range 40..50 inclusive.
     */
    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        In3050 in3050Class = new In3050();

        System.out.println(in3050Class.in3050(37,48)); //false
        System.out.println(in3050Class.in3050(35,34));  //true
    }
}
