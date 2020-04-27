package com.measurement;

public class LitreImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 1;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.VOLUME;
    }
}
