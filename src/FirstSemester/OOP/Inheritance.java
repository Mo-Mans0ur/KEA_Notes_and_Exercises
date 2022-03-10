package FirstSemester.OOP;

public class Inheritance {

    /*
    let start with an example

    we have 3 Classes

    a user
    a premiumUser
    an adminUser
-----------------------------------------------------------------
    box number 1 (user):
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
----------------------------------------------------------------
      so instead of writing the code again and again and again
      we can make the user inherit the attributes to the premium and the
      adminUser

      because D.R.Y = Don't Repeat Yourself

----------------------------------------------------------------
      new keyword: super: constructor for the parent class

      we are actually taking this:

      public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    and give it to the child class (inheritance) but changes so
    it looks like this

    public User(String username, String password) {
        super(username,password);

    }
----------------------------------------------------------------
        Relationships

        apple is a fruit right?

        then the fruit is the parent class
        and the apple is the child class it inherit the name fruit
----------------------------------------------------------------
        @override

        it means to write over a code


     */

    public static void main(String[] args) {

        Password matildesPassword = new Password("Dontjudgeme","thisshitworks");
        Password markusPassword = new Password("markusthegreat", "imthegreatest");
        Password tildesPassword = new Password("blomtertilde", "flowersislife");


        /*
        User matilde = new User("matildeDreamgirl", matildesPassword);
        PremiumUser tilde = new PremiumUser("tildelilje", tildesPassword);

        //System.out.println(tilde.username);
        System.out.println(tilde.generateNewPassword());

        AdminUser markus = new AdminUser("kingmarkus", markusPassword, "imtheKing@hotmail.com");
        //System.out.println(markus.email);

        //System.out.println(markus.showStatistic());

        */
        //thats all folks
    }
}
