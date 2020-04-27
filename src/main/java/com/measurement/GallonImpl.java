package com.measurement;

public class GallonImpl implements IUnitAdaptor {
    @Override
    public double getBaseValue() {
        return 3.78;
    }

    @Override
    public UnitType getUnitType() {
        return UnitType.VOLUME;
    }
}
