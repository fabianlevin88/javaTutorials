package teenNumberCheckerEX;

public class Main {

    public static void main(String[] args) {
        TeenNumberChecker teen = new TeenNumberChecker();

        teen.isTeen(13);

        teen.hasTeen(3,19,22);
        teen.hasTeen(0,0,0);
    }
}
