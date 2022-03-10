package ExamPreparation.CodingBatExercises.WarmUp2;

public class Array123 {

    /*
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     */

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length -2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Array123 array123Class = new Array123();

        System.out.println(array123Class.array123(new int[]{1,2,3,4,2}));   //true
        System.out.println(array123Class.array123(new int[]{3,1,2,7,4,}));  //false
    }
}
