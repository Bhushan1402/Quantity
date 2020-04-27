package com.measurement;


public class FeetImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 12;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
