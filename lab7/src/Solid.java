public abstract class Solid {

    public double dokladnoscEpsylon = 0.1;
    private enum Unit{
        mm ("mm"),
        cm ("cm"),
        dm ("dm"),
        m ("m");
        private String nazwa;
        private Unit(String s) {
            nazwa = s;}
        public String toString(){
            return this.nazwa;}
    }

    Unit unitName = Unit.mm;

    public Solid(Unit unit) {unitName = unit;}
    public Solid(){}

    public Unit getUnitName() {
        return unitName;
    }

    public boolean equals(Object o)
    {

        return unitName == ((Solid) o).getUnitName();
    }

    public abstract double volume();
    public abstract double surfaceArea();

}