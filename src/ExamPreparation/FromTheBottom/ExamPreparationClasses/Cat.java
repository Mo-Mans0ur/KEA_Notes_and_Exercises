package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class Cat {
    public String name;
    public int mood;
    public boolean ishungry;
    public int energy;

    public Cat(String name ,int mood,int energy, boolean ishungry){
        //System.out.println("in constructor method");
        System.out.println(name);

        this.name = name;
        this.mood = mood;
        this.energy = energy;
        this.ishungry = ishungry;
    }

    public void meow(){
        System.out.println("meow");
    }

    @Override
    public String toString(){
        return "cat{" +
                "name='" + name +'\'' +
                ", mood=" + mood +
                ", ishungry=" + ishungry +
                ", energy=" + energy + '}';
    }
}
