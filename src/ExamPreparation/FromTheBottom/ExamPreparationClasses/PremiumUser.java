package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class PremiumUser extends User{

    public PremiumUser(String userName, String password) {
        super(userName, password);
    }

    public Boolean putInBasket(int discount) {

        return true;
    }






    public String generateNewPassWord() {
        System.out.println("in PremiumUser password generator");

        return "new premium Password";
    }
}
