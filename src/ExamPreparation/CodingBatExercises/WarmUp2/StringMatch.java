package ExamPreparation.CodingBatExercises.WarmUp2;

public class StringMatch {

    /*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in
    the same place in both strings.
     */

    public int stringMatch(String a, String b) {
        //first find out which string is shorter
        int length = Math.min(a.length(), b.length());
        int count = 0;

        //then look at both subString starting at i
        for (int i = 0; i < length - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            if (subA.equals(subB)) { //with string use .equals()
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        StringMatch stringMatchClass = new StringMatch();

        System.out.println(stringMatchClass.stringMatch("abc","abc"));  //2
        System.out.println(stringMatchClass.stringMatch("abc","axc"));  //0
    }
}
