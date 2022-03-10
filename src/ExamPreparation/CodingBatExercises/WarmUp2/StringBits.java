package ExamPreparation.CodingBatExercises.WarmUp2;

public class StringBits {
    /*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     */
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        StringBits stringBitsClass = new StringBits();

        System.out.println(stringBitsClass.stringBits("hello")); //hlo
        System.out.println(stringBitsClass.stringBits("CoCa Cola")); //CC oa
    }
}
