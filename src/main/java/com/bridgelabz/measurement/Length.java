package com.measurement;

public class Length {
    public double quantity;
    public Unit unit;
    public UnitType unitType;

   public enum Unit{
            FEET, INCH, YARD, CENTIMETRE, GALLON, LITRE, MILLILITRE, TONNE,KILOGRAM,GRAM,CELSIUS,FAHRENHEIT;
        }

        public Length( Unit unit,double quantity) {
            IUnitAdaptor unitAdaptor = UnitAdaptorFactory.getObject(unit);
            this.quantity = unitAdaptor.compare(unit,quantity);
            this.unit = unit;
            this.unitType = unitAdaptor.getUnitType();
        }


    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.quantity, quantity) == 0 ;
    }
}
