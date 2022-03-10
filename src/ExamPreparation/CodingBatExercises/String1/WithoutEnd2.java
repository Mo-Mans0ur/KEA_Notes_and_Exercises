package ExamPreparation.CodingBatExercises.String1;

public class WithoutEnd2 {
    /*
    Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.
     */
    public String withoutEnd2(String str) {
        int length = str.length();
        if (length < 3) {
            return "";
        } else {
            return str.substring(1,str.length()-1);
        }
    }

    public static void main(String[] args) {
        WithoutEnd2 withoutEnd2Class = new WithoutEnd2();

        System.out.println(withoutEnd2Class.withoutEnd2("Hello"));  //ell
        System.out.println(withoutEnd2Class.withoutEnd2("abc"));    //b
    }
}
