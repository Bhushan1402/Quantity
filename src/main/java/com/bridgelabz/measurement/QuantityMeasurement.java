package com.measurement;

public class QuantityMeasurement {
    public boolean compare(Length length1, Length length2) throws QuantityMeasurementException {
        try {
            if (length1.unitType != length2.unitType)
                throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH, "Incomparable type");
            return length1.equals(length2);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value entered");
        }
    }

    public double addLengths(Length length1, Length length2) throws QuantityMeasurementException {
        try {
            if (length1.unitType != length2.unitType)
                throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.UNIT_TYPE_MISMATCH, "Incomparable type");
            return length1.quantity + length2.quantity;
        } catch (NullPointerException | QuantityMeasurementException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value entered");
        }
    }
}
