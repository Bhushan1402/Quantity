package com.measurement;

public class YardImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 36;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
