package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class Inheritance {
    public static void main(String[] args) {
        /*
        let's start with an example

        we have 3 Classes

        a user
        a premiumUser
        and an adminUser
----------------------------------------------------------
        class 1 (user)
        - Username: String   <--- attributes
        - Password: String   <--- attributes

        - generateNewPassword(); String   <--- method
        - putInBasket(); boolean   <--- method

        box number 2 (PremiumUser):
        - Username: String
        - Password: String

        - generateNewPassword(); String
        - putInBasket(int discount); boolean    <--- discount

        box number 3 (AdminUser):
        - Username: String
        - Password: String
        - email: String     <--- email

        - generateNewPassword(); String
        - showStatistics(); String          <--- statistics
------------------------------------------------------------------
        so instead of writing the code again and again and again
        we can make the user inherit the attributes to the premium and
        the adminUser


        so It's what's called D.R.Y = Don't Repeat Yourself
------------------------------------------------------------------
        new keyword: super: constructor for the parent class

        we are actually taking this:

         public User(String username, String password) {
             this.username = username;
             this.password = password;
         }

         and give it to the child class (inheritance) but changes, so
         it looks like this

        public User(String username, String password) {
            super(username,password);

         }
-----------------------------------------------------------------
         Relationships

         apple is a fruit right?

         so the fruit is the parent class.
         and the apple is one of many child classes that inherit
         the meaning of fruit
-----------------------------------------------------------------
         @Override

         says itself it writes over a code

         now lets try it out in code
         */


        Password mathildesPassword = new Password("Dontjudgeme","thisShitWorks");
        Password markusPassword = new Password("MarkusTheGreat","ImTheGreatest");
        Password tildesPassword = new Password("BlomsterTilde","FlowerPower");

        //User mathilde = new User("MathildeDreamGirl", mathildesPassword);
        //PremiumUser tilde = new PremiumUser("TildeLilje",tildesPassword);

        //System.out.println(tilde.getUserName());
        //System.out.println(tilde.generateNewPassWord());

        //AdminUser markus = new AdminUser("KingMarkus", markusPassword, "imtheKing@hotmail.com");

        //System.out.println(markus);
        //System.out.println(markus.showStatistic());
    }
}
