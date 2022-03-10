package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class AdminUser extends User{
    private String email;


    public AdminUser(String userName, String password, String email) {
        super(userName, password);
        this.email = email;
    }

    public String showStatistic() {
        return this.email + "  " + this.getUserName();
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "email='" + email + '\'' +
                '}';
    }
}
