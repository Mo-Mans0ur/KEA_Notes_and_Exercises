package Exam;

public class Customer {
    private static int balance;
    private static Boolean ifWearingAHat;
    private static Boolean ifCustomerIsMean;


    public Customer(int balance, Boolean ifWearingAHat, Boolean ifCustomerIsMean) {
        this.balance = balance;
        this.ifWearingAHat = ifWearingAHat;
        this.ifCustomerIsMean = ifCustomerIsMean;
    }

    public int getBalance() {
        return balance;
    }

    public Boolean getIfWearingAHat() {
        return ifWearingAHat;
    }

    public Boolean getIfCustomerIsMean() {
        return ifCustomerIsMean;
    }

    @Override
    public String toString() {
        return "Exam.Customer{" +
                "balance=" + balance +
                ", ifWearingAHat=" + ifWearingAHat +
                ", ifCustomerIsMean=" + ifCustomerIsMean +
                '}';
    }


    public static void ifPosOrNeg() {
        if (balance > 0) {
            System.out.println("positive");
        } else if (balance < 0) {
            System.out.println("negative");
        } else if (balance == 0){
            System.out.println("Zero");
        }
    }
}
