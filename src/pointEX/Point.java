package pointEX;

public class Point {

    private int x;
    private int y;
    public static final int ZERO = 0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(((ZERO - getX()) * (ZERO - getX())) + ((ZERO - getY()) * (ZERO - getY())));
    }

    public double distance(int x, int y){
        return Math.sqrt(((x - getX()) * (x - getX())) + ((y - getY()) * (y - getY())));
    }

    public double distance(Point point) {
        return Math.sqrt(((point.getX() - getX()) * (point.getX() - getX())) + ((point.getY() - getY()) * (point.getY() - getY())));
    }
}
