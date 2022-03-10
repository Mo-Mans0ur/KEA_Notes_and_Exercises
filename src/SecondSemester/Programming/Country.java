package SecondSemester.Programming;

public class Country implements Comparable<Country>{
    public String name;
    public int size;
    public int bnp;
    public float latitude;


    public Country(String name, int size, int bnp, float latitude) {
        this.name = name;
        this.size = size;
        this.bnp = bnp;
        this.latitude = latitude;
    }


    public int getBmp() {
        return bnp;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", bmp=" + bnp +
                ", latitude=" + latitude +
                '}';
    }

    @Override
    public int compareTo(Country o) {

        if (size < o.size) {
            return -1;
        } else if (size > o.size) {
            return 1;
        } else {
            return 0;
        }


    }
}
