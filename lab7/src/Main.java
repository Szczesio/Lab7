public class Main {
    public static void main (String[] args)
    {
        System.out.println(Point.one_zero);
        Point p = Point.of (7, 4);
        System.out.println("Punkt p: " + p);
        Point p2 = p.symmetryOx();
        System.out.println("Odbicie wzgledem Ox: " + p2);
        double a = -3;
        double b = 2;
        Point p3 = p.move(a, b);
        System.out.println("Przesuniecie p o wektor (" + a + ", " + b + "): " + p3);
        Point p4 = p.symmetryOy();
        System.out.println("Odbicie wzgledem Oy: " + p4);
        System.out.println(Point.one_zero);
        System.out.println(Point.zero_zero);
    }
}
