package sum3And5EX;

public class Sum3And5EX {

    private int sumTotal = 0;

    public int getSum3And5(int range) {
        for (int index = 1; index <= range; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println(index + " is divisible by both 3 and 5");
                sumTotal += index;
            }
        }

        return sumTotal;
    }
}
