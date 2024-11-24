public class Point {
    final double x;
    final double y;

    static final Point zero_zero = new Point (0, 0);
    static final Point one_zero = new Point(1, 0);

    private Point( double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public static Point of (double x, double y)
    {
        return new Point(x, y);
    }

    Point move(double vx, double vy)
    {
        return new Point(x + vx, y + vy);

    }

    Point symmetryOx()
    {
        return new Point(x, -y);
    }

    Point symmetryOy()
    {
        return new Point(-x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
