package ExamPreparation.CodingBatExercises.WamUp1;

public class Diff21 {
    /*
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.
     */

    public int diff21(int n) {

        if (n < 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }

    }

    public static void main(String[] args) {
        Diff21 diff21Class = new Diff21();

        System.out.println(diff21Class.diff21(33));
        System.out.println(diff21Class.diff21(15));
    }
}