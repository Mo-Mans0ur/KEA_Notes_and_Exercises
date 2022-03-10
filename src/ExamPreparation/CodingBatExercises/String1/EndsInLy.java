package ExamPreparation.CodingBatExercises.String1;

public class EndsInLy {
    /*
    Given a string, return true if it ends in "ly".
     */
    public boolean endsInLy(String str) {
        int length = str.length();
        String ly = "ly";

        if (length < 2) {
            return false;
        } else if (ly.equals(str.substring(length - 2, length))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EndsInLy endsInLyClass = new EndsInLy();

        System.out.println(endsInLyClass.endsInLy("oddly"));     //true
        System.out.println(endsInLyClass.endsInLy("oddball"));   //false
    }
}
