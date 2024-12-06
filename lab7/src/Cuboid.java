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
    
    public boolean equals(Cuboid cube)
    {
        return (unitName==cube.getUnitName() && Math.abs(a-cube.a) <= dokladnoscEpsylon  && Math.abs(b - cube.b) <= dokladnoscEpsylon  && Math.abs(c-cube.c) <= dokladnoscEpsylon);
    }
}
