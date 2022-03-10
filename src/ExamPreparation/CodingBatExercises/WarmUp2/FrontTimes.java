package ExamPreparation.CodingBatExercises.WarmUp2;

public class FrontTimes {
    /*
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     or whatever is there if the string is less than length 3. Return n copies of the front;
     */
    public String frontTimes(String str, int n) {
        int frontlength = 3;
        if (frontlength > str.length()) {
            frontlength = str.length();
        }
        String front = str.substring(0,frontlength);

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
            
        }
        return result;
    }

    public static void main(String[] args) {
        FrontTimes frontTimesClass = new FrontTimes();

        System.out.println(frontTimesClass.frontTimes("Chocolate", 2)); //ChoCho
        System.out.println(frontTimesClass.frontTimes("Gator", 3));     //GatGatGat
    }
}
