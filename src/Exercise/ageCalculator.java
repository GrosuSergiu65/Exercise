package Exercise;

import java.time.LocalDate;
import java.time.Period;

public class ageCalculator {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1995, 8, 29);
        int years = Period.between(birthDate, today).getYears();
        System.out.println(years);
    }
}
