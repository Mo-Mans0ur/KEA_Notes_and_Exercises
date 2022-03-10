package SecondSemester.Programming;

import java.util.Comparator;

public class CompareCountryBmp implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {

        if (o1.bnp < o2.bnp) {
            return -1;
        } else if (o1.bnp > o2.bnp) {
            return 1;
        } else {
            return 0;
        }

    }
}
