package com.measurement;

public class MilliLitre implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 0.001;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.VOLUME;
    }
}
