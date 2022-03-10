package ExamPreparation.CodingBatExercises.WamUp1;

import java.util.Locale;

public class EndUp {
    /*
    Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.
    Note that str.toUpperCase() returns the uppercase version of a string.
     */

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        int cut = str.length() -3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);   //from cut to end

        return front + back.toUpperCase();
    }

    public static void main(String[] args) {
        EndUp endUpClass = new EndUp();

        System.out.println(endUpClass.endUp("hello"));      //heLLO
        System.out.println(endUpClass.endUp("hi There"));  // hi ThERE
    }
}
