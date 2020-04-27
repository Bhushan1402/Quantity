package com.measurement;

public class QuantityMeasurement {
    public boolean compare(Length length1, Length length2) throws QuantityMeasurementException {
        try {
            if (length1.unitType != length2.unitType)
                throw new QuantityMeasurementException("Incomparable type", QuantityMeasurementException.ExceptionType.UnitType_Mismatch);

            return length1.equals(length2);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value entered", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    public double addLengths(Length length1, Length length2) throws QuantityMeasurementException {
        try {
            if (length1.unitType != length2.unitType)
                throw new QuantityMeasurementException("Incomparable type",QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH);
            return length1.quantity + length2.quantity;
        } catch (NullPointerException | QuantityMeasurementException e) {
            throw new QuantityMeasurementException("Null value entered",QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }
}
