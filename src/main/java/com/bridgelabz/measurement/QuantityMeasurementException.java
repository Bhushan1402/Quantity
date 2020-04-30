package com.measurement;

public class QuantityMeasurementException extends Throwable {
    public enum ExceptionType {
        NULL_VALUE,UNIT_TYPE_MISMATCH;
    }
    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
