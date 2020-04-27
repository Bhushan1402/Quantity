package com.measurement;

public class QuantityMeasurementException extends Throwable {
    public enum ExceptionType {
        UnitType_Mismatch,NULL_VALUE,UNIT_TYPE_MISMATCH;
    }
    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
