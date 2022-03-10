package ExamPreparation.CodingBatExercises.WamUp1;

public class Or35 {
    /*
    Return true if the given non-negative number is a multiple of 3
    or a multiple of 5. Use the % "mod" operator
     */

    public boolean or35(int n) {

        return (n % 3 == 0 || n % 5 == 0);
    }

    public static void main(String[] args) {
        Or35 or35Class = new Or35();

        System.out.println(or35Class.or35(6));  //true
        System.out.println(or35Class.or35(10)); //true
        System.out.println(or35Class.or35(4));  //false
        System.out.println(or35Class.or35(18)); //true
    }
}
