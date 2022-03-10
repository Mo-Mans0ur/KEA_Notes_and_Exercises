package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class Password {
    public String password;
    public String encryption;

    public Password(String password, String encryption) {
        this.password = password;
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "Password{" +
                "password='" + password + '\'' +
                ", encryption='" + encryption + '\'' +
                '}';
    }
}
