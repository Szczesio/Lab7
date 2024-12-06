public abstract class Solid {
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

    public Solid(Unit unit)
    {
        unitName = unit;
    }

    public Unit getUnitName() {
        return unitName;
    }

    public boolean equals(Solid b)
    {
        return unitName == b.getUnitName();
    }

    public abstract double volume();
    public abstract double surfaceArea();

}