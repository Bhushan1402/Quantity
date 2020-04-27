package com.measurement;

public class QuantityMeasurement {
    public static boolean compare(Length length1, Length length2) {
        return length1.equals(length2);
    }
    public static Length addLengths(Length length1, Length length2) {
        double totalLength = length1.quantity+length2.quantity;
        Length lengthInInch = new Length(Length.Unit.INCH, totalLength);
        return lengthInInch;
    }
}
