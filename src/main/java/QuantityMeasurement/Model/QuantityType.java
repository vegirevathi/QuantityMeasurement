package QuantityMeasurement.Model;

import QuantityMeasurement.Exception.QuantityException;

import java.util.Objects;

public class QuantityType {
    public enum Unit{ CELSIUS, FAHRENHEIT, FEET, INCH, YARD, CENTIMETER, GALLON, LITRE, MILLILITRE, GRAM, KILOGRAM, TONNE };

    private final Unit unit;
    public final double value;

    public QuantityType(Unit unit, double value) throws QuantityException {
        if (value<0) throw new QuantityException("Quantity should not be negative value", QuantityException.ExceptionType.NEGATIVE_UNIT_VALUE);
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityType that = (QuantityType) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }
}
