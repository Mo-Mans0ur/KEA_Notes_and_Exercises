package ExamPreparation.CodingBatExercises.WamUp1;

public class FrontBack {
    /*
    Given a string, return a new string where the first and last chars have been exchanged.
     */

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String mid = str.substring(1, str.length() - 1);

        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public static void main(String[] args) {
        FrontBack frontBackClass = new FrontBack();


        System.out.println(frontBackClass.frontBack("Table"));  //eablT
        System.out.println(frontBackClass.frontBack("Worm"));   //morW
    }
}
