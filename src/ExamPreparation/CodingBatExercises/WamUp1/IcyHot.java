package ExamPreparation.CodingBatExercises.WamUp1;

public class IcyHot {
    /*
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     */

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100 || (temp1 > 100 && temp2 < 0)) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        IcyHot icyHotClass = new IcyHot();

        System.out.println(icyHotClass.icyHot(120, -1));    //true
        System.out.println(icyHotClass.icyHot(2, 120));     //false

    }
}
