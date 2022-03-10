package ExamPreparation.ExamPreparationQuestions;

import java.util.Scanner;

public class Keyword2 {
    private String word;
    private String definition;

    static Scanner scanner = new Scanner(System.in);

    public Keyword2(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public boolean matches() {
        String input = scanner.nextLine();
        if (word.equals(input)) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public String toString() {
        return "Keyword2{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Keyword2 keyword2Class = new Keyword2("Howling","to scream really loudly");



        System.out.println(keyword2Class.matches());
    }

    //went great but no N. 3
}
