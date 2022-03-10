package ExamPreparation.CodingBatExercises.WamUp1;

public class Front3 {

    /*
    Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front.
     */

    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            return front = str;
        }
        return front + front + front;
    }

    public static void main(String[] args) {
        Front3 front3Class = new Front3();

        System.out.println(front3Class.front3("Chocolate"));    //ChoChoCho
        System.out.println(front3Class.front3("Motor"));        //MotMotMot

    }
}
