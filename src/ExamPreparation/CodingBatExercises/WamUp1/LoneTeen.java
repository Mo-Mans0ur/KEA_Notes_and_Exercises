package ExamPreparation.CodingBatExercises.WamUp1;

public class LoneTeen {

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.
     */
    public boolean loneTeen(int a, int b) {
        boolean teenA = (a >= 13 && a <= 19);
        boolean teenB = (b >= 13 && b <= 19);

        return (!teenA && teenB) || (teenA && !teenB);
    }

    public static void main(String[] args) {
        LoneTeen loneTeenCLass = new LoneTeen();

        System.out.println(loneTeenCLass.loneTeen(13,23));      //true
        System.out.println(loneTeenCLass.loneTeen(13,13));      //false
    }
}
