package ExamPreparation.CodingBatExercises.WamUp1;

public class EveryNth {
    /*
    Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string.

    So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     */

    public String everyNth(String str, int n) {
        String result = "";

        for (int i = 0; i < str.length(); i = i + n) { //look through every Nth char
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        EveryNth everyNthClass = new EveryNth();

        System.out.println(everyNthClass.everyNth("Miracle", 2));   //Mrce
        System.out.println(everyNthClass.everyNth("Television",4)); //Tvo
    }
}
