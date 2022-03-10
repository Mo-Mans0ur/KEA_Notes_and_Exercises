package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String generateNewPassword() {
        System.out.println("in User password generator");

        return "new User Password";
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }
}
