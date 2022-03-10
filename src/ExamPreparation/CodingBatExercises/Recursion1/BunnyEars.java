package ExamPreparation.CodingBatExercises.Recursion1;

public class BunnyEars {

    /*
    We have a number of bunnies and each bunny has two big floppy ears.
    We want to compute the total number of ears across all the bunnies recursively
    (without loops or multiplication).
     */

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    public static void main(String[] args) {
        BunnyEars bunnyEarsClass = new BunnyEars();

        System.out.println(bunnyEarsClass.bunnyEars(4));    //8
        System.out.println(bunnyEarsClass.bunnyEars(2));    //2
    }
}
