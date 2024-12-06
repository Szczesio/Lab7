import java.lang.Math;
public class Cuboid extends Solid{
    double a;
    double b;
    double c;

    @Override
    public double volume()
    {
        return a * b * c;
    }

    @Override
    public double surfaceArea() {
        return 2*a*b + 2*a*c + 2*b*c;
    }

    @Override
    public boolean equals(Object cube)
    {
        return (unitName==((Cuboid)cube).getUnitName() && Math.abs(a-((Cuboid)cube).a) <= dokladnoscEpsylon  && Math.abs(b - ((Cuboid)cube).b) <= dokladnoscEpsylon  && Math.abs(c-((Cuboid)cube).c) <= dokladnoscEpsylon);
    }
}
