package ExamPreparation.CodingBatExercises.WarmUp2;

public class ArrayCount9 {
    /*
    Given an array of ints, return the number of 9's in the array.
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayCount9 arrayCount9Class = new ArrayCount9();

        System.out.println(arrayCount9Class.arrayCount9(new int[]{2, 5, 3, 4, 9})); //1
        System.out.println(arrayCount9Class.arrayCount9(new int[]{2,1,4,9,9,9}));   //3
    }
}
