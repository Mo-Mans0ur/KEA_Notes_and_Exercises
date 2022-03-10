package ExamPreparation.CodingBatExercises.String1;

public class ComboString {

    /*
    Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).
     */

    public String comboString(String a, String b) {
        int lengthA = a.length();
        int lenghtB = b.length();

        if (lengthA > lenghtB) {
            return b+a+b;
        }else {
           return a+b+a;
        }
    }

    public static void main(String[] args) {
        ComboString comboStringClass = new ComboString();

        System.out.println(comboStringClass.comboString("Hello","hi"));     //hiHellohi
        System.out.println(comboStringClass.comboString("hi", "Hello"));    //hiHellohi
        System.out.println(comboStringClass.comboString("aaa","b"));        //baaab
    }
}
