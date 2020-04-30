package com.bridgelabz.quantitymeasurement.utility;

public enum UnitMeasurements {
    FEET(12.0, MeasurementType.LENGTH),
    INCH(1.0, MeasurementType.LENGTH),
    YARD(36.0, MeasurementType.LENGTH),
    CENTIMETER(0.4, MeasurementType.LENGTH),
    GALLON(3.78, MeasurementType.VOLUME),
    LITRES(1, MeasurementType.VOLUME),
    MILLILITERS(0.001, MeasurementType.VOLUME),
    KILOGRAMS(1.0, MeasurementType.WEIGHT),
    GRAMS(0.001, MeasurementType.WEIGHT),
    TONNE(1000, MeasurementType.WEIGHT),
    FAHRENHEIT(5.0 / 9.0, MeasurementType.TEMPERATURE),
    CELSIUS(9.0 / 5.0, MeasurementType.TEMPERATURE);
    Double baseValue;
    MeasurementType type;

    UnitMeasurements(double baseValue, MeasurementType type) {
        this.baseValue = baseValue;
        this.type = type;
    }

    public Double convertToBaseValue(Double quantity, UnitMeasurements unitMeasurements) {
        switch (unitMeasurements) {
            case FAHRENHEIT:
                return ((quantity - 32) * (baseValue));
            case CELSIUS:
                return ((quantity * (baseValue)) + 32);
            default:
                return quantity * baseValue;
        }
    }
}