package ExamPreparation.CodingBatExercises.WamUp1;

public class NotStrings {

    /*
    Given a string, return a new string where "not " has been added to the front. However,
    if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.
     */

    public String notString(String str) {

        if (str.length() >= 3 && str.substring(0,3).equals("Not")) {
            return str;
        }
        return "Not" + str;
    }

    public static void main(String[] args) {
        NotStrings notStringsClass = new NotStrings();


        System.out.println(notStringsClass.notString("String"));    //NotString
        System.out.println(notStringsClass.notString("NotString")); // NotString
        System.out.println(notStringsClass.notString("Candy"));
    }
}
