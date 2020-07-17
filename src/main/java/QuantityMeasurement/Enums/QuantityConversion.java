package QuantityMeasurement.Utility;

import QuantityMeasurement.Enums.QuantityType;

public enum QuantityConversion {
    FEET_TO_INCH(QuantityType.LENGTH, 12),
    YARD_TO_FEET(QuantityType.LENGTH, 3),
    YARD_TO_INCH(QuantityType.LENGTH, 36),
    INCH_TO_YARD(QuantityType.LENGTH, 0.0277),
    FEET_TO_YARD(QuantityType.LENGTH, 0.333),
    INCH_TO_CENTIMETER(QuantityType.LENGTH, 2.5),
    CENTIMETER_TO_INCH(QuantityType.LENGTH, 0.4),
    GALLON_TO_LITRE(QuantityType.VOLUME, 3.78),
    LITRE_TO_MILLILITRE(QuantityType.VOLUME, 1000),
    MILLILITRE_TO_LITRE(QuantityType.VOLUME, 0.001),
    KILOGRAM_TO_GRAM(QuantityType.WEIGHT, 1000),
    GRAM_TO_KILOGRAM(QuantityType.WEIGHT, 0.001),
    TONNE_TO_KILOGRAM(QuantityType.WEIGHT, 1000),
    CELSIUS_TO_FAHRENHEIT(QuantityType.TEMPERATURE, 1.8);

    public double CONVERSION_FACTOR;
    public QuantityType quantityType;

    QuantityConversion(QuantityType quantityType, double CONVERSION_FACTOR) {
        this.quantityType = quantityType;
        this.CONVERSION_FACTOR = CONVERSION_FACTOR;
    }

}
