package com.measurement;

public class FahrenheitImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 212;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.TEMPERATURE;
    }
}
