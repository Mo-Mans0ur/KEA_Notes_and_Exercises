package ExamPreparation.CodingBatExercises.WarmUp2;

public class StringTimes {

    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     */

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str; //could use += here
        }
        return result;
    }

    public static void main(String[] args) {
        StringTimes stringTimesClass = new StringTimes();

        System.out.println(stringTimesClass.stringTimes("Hi", 4));      //HiHiHiHi
        System.out.println(stringTimesClass.stringTimes("Hello",5));    //HelloHelloHelloHelloHello
    }
}
