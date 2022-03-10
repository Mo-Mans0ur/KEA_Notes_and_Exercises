package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class Car {
    public String model;
    public int price;
    public String nameOfDriver;
    public int ageOfDriver;

    public Car(String model, int price, String nameOfDriver, int ageOfDriver) {
        this.model = model;
        this.price = price;
        this.nameOfDriver = nameOfDriver;
        this.ageOfDriver = ageOfDriver;
    }


    public void start() {
        System.out.println("krkrkrkr wrOOooom");
    }

    public void stop() {
        System.out.println("iiiieeeeiei");
    }

    public void move() {
        System.out.println("wroooooooooooomm");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
