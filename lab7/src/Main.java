public class Main {
    public static void main (String[] args)
    {
        Cuboid kwadrat = new Cuboid();
        kwadrat.setA(5.6);
        kwadrat.setB(-2.5);
        kwadrat.setC(2.1);
        System.out.println(kwadrat.surfaceArea());
        System.out.println(kwadrat.volume());
    }
}
