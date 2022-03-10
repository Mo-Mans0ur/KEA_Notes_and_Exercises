package ExamPreparation.CodingBatExercises.WamUp1;

public class Max10 {
    /*
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     or return 0 if neither is in that range.
     */

    public int max1020(int a, int b) {
        if (b > a) {
            int temp =  a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Max10 max10Class = new Max10();

        System.out.println(max10Class.max1020(13,15)); // b = 15
        System.out.println(max10Class.max1020(14,17));  // c = 17
    }
}
