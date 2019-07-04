package timeConverterEX;

import static timeConverterEX.TimeConverter.*;

public class Main {
    public static void main(String[] args) {

        String response = getDurationString(140, 59);

        String res = getDurationString(50000);

        System.out.println(response);
        System.out.println(res);
    }
}
