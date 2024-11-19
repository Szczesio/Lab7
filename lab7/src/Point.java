public class Point {
    static double x;
    static double y;

    static Point zero_zero = new Point (0, 0);
    static Point one_zero = new Point(1, 0);

    public Point( double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public static double getX() {
        return x;
    }

    public static double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
