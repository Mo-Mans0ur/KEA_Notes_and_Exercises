package ExamPreparation.CodingBatExercises.String1;

public class NTwice {
    /*
    Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.
     */

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public static void main(String[] args) {
        NTwice nTwiceClass = new NTwice();

        System.out.println(nTwiceClass.nTwice("Hello", 2));     //Helo
        System.out.println(nTwiceClass.nTwice("Chocolate",1));  //Ce
    }
}
