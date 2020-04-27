package com.measurement;

public class Length {
    public double value;
    public double quantity;
    public Unit unit;

    enum Unit{
        FEET(12), INCH(1),YARD(36);
        double baseValue;

        Unit(double baseValue) {
            this.baseValue = baseValue;
        }

        public double compare(double quantity) {
            return this.baseValue * quantity;
        }
    }

    public Length( Unit unit,double quantity) {
        this.quantity = unit.compare(quantity);
        this.unit = unit;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.quantity, quantity) == 0 ;
    }
}
