package polymorphismEX;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            Movie movie = listOfMovie(i);
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "with plot: " + movie.plot() + "\n");
        }
    }

    public static Movie listOfMovie(int random) {

        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgetable();
            default:
                return null;
        }
    }
}
