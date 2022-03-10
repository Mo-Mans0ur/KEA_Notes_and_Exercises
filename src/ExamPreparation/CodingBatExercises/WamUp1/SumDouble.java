package ExamPreparation.CodingBatExercises.WamUp1;

public class SumDouble {
    /*
    Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.
     */

    public int sumDouble(int a, int b) {

        int sum = a + b;

        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }


    public static void main(String[] args) {
        SumDouble sumDoubleClass = new SumDouble();

        System.out.println(sumDoubleClass.sumDouble(2, 2));
        System.out.println(sumDoubleClass.sumDouble(4, 3));


    }
}
