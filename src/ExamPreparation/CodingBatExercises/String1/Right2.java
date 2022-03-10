package ExamPreparation.CodingBatExercises.String1;

public class Right2 {
    /*
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.
     */
    public String right2(String str) {
        return str.substring(str.length()-2, str.length()) + str.substring(0,str.length()-2);
    }

    public static void main(String[] args) {
        Right2 right2Class = new Right2();

        System.out.println(right2Class.right2("java"));     //Vaja
        System.out.println(right2Class.right2("hello"));    //loHel
    }
}
