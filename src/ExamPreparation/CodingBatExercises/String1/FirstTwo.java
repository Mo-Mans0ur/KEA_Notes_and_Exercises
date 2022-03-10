package ExamPreparation.CodingBatExercises.String1;

public class FirstTwo {

    /*
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X",
    and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
     */

    public String firstTwo(String str) {
        String first = str.substring(0,2);
        return first;

    }

    //or more precise, this takes just one index too

    public String firstTwo2(String str) {

        int length = str.length();
        if (length < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public static void main(String[] args) {
        FirstTwo firstTwoClass = new FirstTwo();

        System.out.println(firstTwoClass.firstTwo("Hello"));    //He
        System.out.println(firstTwoClass.firstTwo("abcdefg"));  //ab
        System.out.println(firstTwoClass.firstTwo("ab"));       //ab

    }
}
