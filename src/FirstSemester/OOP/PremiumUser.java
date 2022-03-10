package FirstSemester.OOP;

public class PremiumUser extends User {


    //constructor
    public PremiumUser(String username, Password password) {
        super(username, password);
    }

    public boolean putInBasket(int discount) {

        return true;
    }

    @Override
    public String generateNewPassword() {
        System.out.println("in PremiumUser password generator");
        return "new premium Password";
    }
}
