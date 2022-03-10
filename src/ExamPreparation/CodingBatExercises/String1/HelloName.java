package ExamPreparation.CodingBatExercises.String1;

public class HelloName {
    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     */

    public String helloName(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        HelloName helloNameClass = new HelloName();


        System.out.println(helloNameClass.helloName("Bob"));    //Hello Bob
        System.out.println(helloNameClass.helloName("Lisa"));   //Hello Lisa
    }
}
