package ExamPreparation.CodingBatExercises.WamUp1;

public class StringE {

    /*
    Return true if the given string contains between 1 and 3 'e' chars.
     */
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public static void main(String[] args) {
        StringE stringEClass = new StringE();

        System.out.println(stringEClass.stringE("Hello"));      //true
        System.out.println(stringEClass.stringE("Heeello"));    //true
        System.out.println(stringEClass.stringE("Heeeello"));   //false

    }
}
