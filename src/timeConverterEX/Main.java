package timeConverterEX;

import static timeConverterEX.TimeConverter.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(140, 59));

        System.out.println(getDurationString(50000));

        System.out.println(getDurationString(-100));
    }
}
