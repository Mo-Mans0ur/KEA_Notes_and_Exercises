package ExamPreparation.CodingBatExercises.String1;

public class WithoutEnd {
    /*
    Given a string, return a version without the first and last char,
    so "Hello" yields "ell". The string length will be at least 2.
     */

    public String withoutEnd(String str) {
        int length = str.length();

        return str.substring(1, length - 1);
    }

    public static void main(String[] args) {
        WithoutEnd withoutEndClass = new WithoutEnd();

        System.out.println(withoutEndClass.withoutEnd("Hello"));    //ell
        System.out.println(withoutEndClass.withoutEnd("Java"));     //av
    }
}
