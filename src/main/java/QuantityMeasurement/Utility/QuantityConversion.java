package QuantityMeasurement.Utility;

public enum QuantityConversion {
    FEET_TO_INCH(12),
    YARD_TO_FEET(3),
    YARD_TO_INCH(36),
    INCH_TO_YARD(0.0277),
    FEET_TO_YARD(0.333),
    INCH_TO_CENTIMETER(2.5),
    CENTIMETER_TO_INCH(0.4),
    GALLON_TO_LITRE(3.78),
    LITRE_TO_MILLILITRE(1000),
    MILLILITRE_TO_LITRE(0.001),
    KILOGRAM_TO_GRAM(1000),
    GRAM_TO_KILOGRAM(0.001),
    TONNE_TO_KILOGRAM(1000);

    public final double CONVERSION_FACTOR;

    QuantityConversion(double CONVERSION_FACTOR) {
        this.CONVERSION_FACTOR = CONVERSION_FACTOR;
    }

}
