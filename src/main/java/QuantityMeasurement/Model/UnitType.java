package QuantityMeasurement.Model;

import QuantityMeasurement.Enums.QuantityType;
import QuantityMeasurement.Exception.QuantityException;

public class UnitType {

    public enum Unit{ CELSIUS, FAHRENHEIT, FEET, INCH, YARD, CENTIMETER, GALLON, LITRE, MILLILITRE, GRAM, KILOGRAM, TONNE };
    private final QuantityType quantityType;
    private final Unit unit;
    public final double value;

    public UnitType(QuantityType quantityType, Unit unit, double value) throws QuantityException {
        if (value<0) throw new QuantityException("Quantity should not be negative value", QuantityException.ExceptionType.NEGATIVE_UNIT_VALUE);
        this.quantityType = quantityType;
        this.unit = unit;
        this.value = value;
    }

    /**Checking for equality of this class and entered object
     *
     * @param o is the object of the same class
     * @return true if this and o is same
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitType that = (UnitType) o;
        return Double.compare(that.value, value) == 0 &&
                quantityType == that.quantityType &&
                unit == that.unit;
    }
}
