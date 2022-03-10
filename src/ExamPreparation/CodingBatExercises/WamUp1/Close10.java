package ExamPreparation.CodingBatExercises.WamUp1;

public class Close10 {

    /*
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
     */

    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        if (diffA < diffB) {
            return a;
        } else if (diffB < diffA) {
            return b;
        }
        return 0;  //its the same as sayin diffA == diffB
    }

    public static void main(String[] args) {
        Close10 close10Class = new Close10();

        System.out.println(close10Class.close10(7,13)); //0 = tie
        System.out.println(close10Class.close10(4,19)); // a = 4
    }
}
