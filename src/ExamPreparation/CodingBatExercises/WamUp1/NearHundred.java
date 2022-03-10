package ExamPreparation.CodingBatExercises.WamUp1;

public class NearHundred {
    /*
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
     */

    public boolean near100(int n) {
        if (n >= 90 && n <= 100) {
            return true;
        } else {
            return false;
        }
    }

    //Other method

    public boolean near100Two(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    public static void main(String[] args) {
        NearHundred nearHundredClass = new NearHundred();

        System.out.println(nearHundredClass.near100(95));   //true

        System.out.println(nearHundredClass.near100(55));   //false

        System.out.println(nearHundredClass.near100Two(32)); //false

        System.out.println(nearHundredClass.near100Two(210));   //true
    }
}
