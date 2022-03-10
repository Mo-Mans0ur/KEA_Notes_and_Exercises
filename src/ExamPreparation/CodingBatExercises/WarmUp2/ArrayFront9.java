package ExamPreparation.CodingBatExercises.WarmUp2;

public class ArrayFront9 {
    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.
     */
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) {
            end = 4;

            for (int i = 0; i < end; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayFront9 arrayFront9Class = new ArrayFront9();

        System.out.println(arrayFront9Class.arrayFront9(new int[]{1, 2, 9, 3, 4})); //true
        System.out.println(arrayFront9Class.arrayFront9(new int[]{1, 2, 3, 4, 9})); //false
    }
}
