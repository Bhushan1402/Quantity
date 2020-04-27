package com.measurement;

public class TonneImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 1000;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.WEIGHT;
    }
}
