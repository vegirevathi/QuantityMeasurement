package QuantityMeasurement.Model;

import java.util.Objects;

public class Temperature {
    public enum Unit{ CELSIUS, FAHRENHEIT };

    private final Unit unit;
    public final double value;

    public Temperature(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }
}
