package com.measurement;

public class CentimetreImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 0.4;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
