package com.measurement;

public class CelsiusImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 100;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.TEMPERATURE;
    }
}
