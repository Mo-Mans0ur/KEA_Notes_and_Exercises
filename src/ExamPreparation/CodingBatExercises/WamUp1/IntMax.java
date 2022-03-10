package ExamPreparation.CodingBatExercises.WamUp1;

public class IntMax {
    /*
    Given three int values, a b c, return the largest.
     */

    public int maxInt(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        IntMax intMaxClass = new IntMax();

        System.out.println(intMaxClass.maxInt(3,23,11));    //b 23
        System.out.println(intMaxClass.maxInt(30,21,99));   //c 99
    }
}
