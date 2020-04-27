package com.measurement;

public class KilogramImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 1;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.WEIGHT;
    }
}
