package ExamPreparation.CodingBatExercises.String1;

public class FirstHalf {
    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     */

    public String firstHalf(String str) {
        int length = str.length();

        return str.substring(0,length / 2);
    }

    public static void main(String[] args) {
        FirstHalf firstHalfClass = new FirstHalf();

        System.out.println(firstHalfClass.firstHalf("Woohoo"));         //Woo
        System.out.println(firstHalfClass.firstHalf("HelloThere"));     //Hello
    }
}
