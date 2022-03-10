package ExamPreparation.CodingBatExercises.WamUp1;

public class Front22 {

    /*
    Given a string, take the first 2 chars and return the string with the 2 chars added
    at both the front and back, so "kitten" yields"kikittenki".
    If the string length is less than 2, use whatever chars are there.
     */

    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    public static void main(String[] args) {
        Front22 front22Class = new Front22();

        System.out.println(front22Class.front22("Parrot")); //PaParrotPa
        System.out.println(front22Class.front22("World"));  //WoWorldWo

    }
}
