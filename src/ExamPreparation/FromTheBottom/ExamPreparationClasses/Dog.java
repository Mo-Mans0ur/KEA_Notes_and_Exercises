package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class Dog{

    public String name;
    public int age;
    public boolean ishungry;
    public int energy;



    public Dog(String name , int age, int energy, boolean ishungry){

        this.name = name;
        this.age = age;
        this.energy = energy;
        this.ishungry = ishungry;
    }

    public void woof() {
        System.out.println("Woof");
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", mood=" + age +
                ", ishungry=" + ishungry +
                ", energy=" + energy +
                '}';
    }

}
