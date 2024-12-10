import java.lang.Math;
public class Cuboid extends Solid{
    double a;
    double b;
    double c;

    public double getA() {

        return a;
    }

    public void setA(double a) {
        if(a<0) throw new LessThanZero(a);
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b<0) throw new LessThanZero(b);
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if(c<0) throw new LessThanZero(c);
        this.c = c;
    }

    @Override
    public double volume()
    {
        double vl = a * b * c;
        if(vl<0) throw new LessThanZero(vl);
        return vl;
    }

    @Override
    public double surfaceArea() {
        double pole = 2*a*b + 2*a*c + 2*b*c;
        if(pole<0) throw new LessThanZero(pole);
        return pole;
    }

    @Override
    public boolean equals(Object cube)
    {
        return (unitName==((Cuboid)cube).getUnitName() && Math.abs(a-((Cuboid)cube).a) <= dokladnoscEpsylon  && Math.abs(b - ((Cuboid)cube).b) <= dokladnoscEpsylon  && Math.abs(c-((Cuboid)cube).c) <= dokladnoscEpsylon);
    }
}
