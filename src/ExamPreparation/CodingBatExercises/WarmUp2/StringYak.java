package ExamPreparation.CodingBatExercises.WarmUp2;

public class StringYak {
    /*
    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    but the "a" can be any char. The "yak" strings will not overlap.
     */

    public String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            //looking for yak
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else { //otherwise do the normal word
                result = result + str.charAt(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        StringYak stringYakClass = new StringYak();

        System.out.println(stringYakClass.stringYak("yakpak")); // pak
        System.out.println(stringYakClass.stringYak("yak123yak"));  //123
    }
}
