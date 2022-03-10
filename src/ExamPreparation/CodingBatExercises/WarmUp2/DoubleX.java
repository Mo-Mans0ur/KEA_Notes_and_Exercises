package ExamPreparation.CodingBatExercises.WarmUp2;

public class DoubleX {
    /*
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     */
    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) {
            return false; //if there's no x
        } else if (i + 1 >= str.length()) {
            return false;
        } else {
            return str.substring(i + 1, i + 2).equals("x");
        }
    }

    public static void main(String[] args) {
        DoubleX doubleXClass = new DoubleX();

        System.out.println(doubleXClass.doubleX("axxbb")); //true
        System.out.println(doubleXClass.doubleX("axaxax")); //false
    }
}
