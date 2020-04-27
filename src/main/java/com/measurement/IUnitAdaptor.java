package com.measurement;

public interface IUnitAdaptor {
    public double getBaseValue();
    public UnitType getUnitType();
    public default double compare(double quantity){
        return this.getBaseValue()*quantity;
    }
}
