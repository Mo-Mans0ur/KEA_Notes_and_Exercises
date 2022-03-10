package ExamPreparation.CodingBatExercises.String1;

public class Left2 {
    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.
     */
    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public static void main(String[] args) {
        Left2 left2Class = new Left2();

        System.out.println(left2Class.left2("hello"));  //llohe
        System.out.println(left2Class.left2("java"));   //vaja
    }
}

