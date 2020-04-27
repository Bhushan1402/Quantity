package com.measurement;

public class QuantityMeasurement {
    public static boolean compare(Length length1, Length length2) throws QuantityMeasurementException {
        try {
            if (length1.unitType != length2.unitType)
                throw new QuantityMeasurementException("Incomparable type", QuantityMeasurementException.ExceptionType.UnitType_Mismatch);

            return length1.equals(length2);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value entered", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    public static Length addLengths(Length length1, Length length2) {
        double totalLength = length1.quantity+length2.quantity;
        Length lengthInInch = new Length(Length.Unit.INCH, totalLength);
        return lengthInInch;
    }
}
