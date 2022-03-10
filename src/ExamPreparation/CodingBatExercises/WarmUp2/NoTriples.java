package ExamPreparation.CodingBatExercises.WarmUp2;

public class NoTriples {
    /*
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    Return true if the array does not contain any triples.
     */

    public boolean noTriples(int[] nums) {
        //iterate < length -2, so can use i + 1 and i + 2 in the loop
        //return false if seeing a triple
        for (int i = 0; i < nums.length - 2 ; i++) {
            int first = nums[i];
            if (nums[i + 1] == first && nums[i + 2] == first) {
                return false;
            }
        }
        return true; //if we get here... no triplets
    }

    public static void main(String[] args) {
        NoTriples noTriplesClass = new NoTriples();

        System.out.println(noTriplesClass.noTriples(new int[]{1, 1, 1, 2, 3, 4}));      //false
        System.out.println(noTriplesClass.noTriples(new int[]{2, 4, 5, 6, 5, 3}));      //true
    }

}
