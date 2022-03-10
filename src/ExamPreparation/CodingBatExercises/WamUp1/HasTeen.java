package ExamPreparation.CodingBatExercises.WamUp1;

public class HasTeen {

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.
     */
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public static void main(String[] args) {
        HasTeen hasTeenClass = new HasTeen();

        System.out.println(hasTeenClass.hasTeen(11,14,33));     //true
        System.out.println(hasTeenClass.hasTeen(4,21,29));      //false
    }
}
