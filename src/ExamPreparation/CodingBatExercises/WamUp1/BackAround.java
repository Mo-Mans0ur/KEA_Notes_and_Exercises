package ExamPreparation.CodingBatExercises.WamUp1;

public class BackAround {
    /*
    Given a string, take the last char and return a
    new string with the last char added at the front and back, so "cat" yields "tcatt".
    The original string will be length 1 or more.
     */

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);

        return last + str + last;
    }

    public static void main(String[] args) {
        BackAround backAroundClass = new BackAround();

        System.out.println(backAroundClass.backAround("Cat")); //tCatt
        System.out.println(backAroundClass.backAround("Dog"));  //gDogg

    }
}
