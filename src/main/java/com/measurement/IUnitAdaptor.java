package com.measurement;

public interface IUnitAdaptor {

    public double getBaseValue();
    public UnitType getUnitType();
    public default double compare(Length.Unit unit,double quantity){
        if (unit == Length.Unit.FAHRENHEIT)
            return ((this.getBaseValue()*quantity - 32) * 5 / 9);
        return this.getBaseValue()*quantity;
    }
}
