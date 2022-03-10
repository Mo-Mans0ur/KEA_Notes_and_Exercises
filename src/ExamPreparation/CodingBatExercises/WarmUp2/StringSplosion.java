package ExamPreparation.CodingBatExercises.WarmUp2;

public class StringSplosion {
    /*
    Given a non-empty string like "Code" return a string like "CCoCodCode".
     */
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        StringSplosion stringSplosionClass = new StringSplosion();

        System.out.println(stringSplosionClass.stringSplosion("Code")); //CCoCodCode
        System.out.println(stringSplosionClass.stringSplosion("abc"));  //aababc
    }
}
