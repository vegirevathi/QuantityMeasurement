package QuantityMeasurement.Model;

import java.util.Objects;

public class Length {
    public enum Unit{ FEET, INCH, YARD, CENTIMETER};

    private final Unit unit;
    public final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
