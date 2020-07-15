package QuantityMeasurement.Model;

import java.util.Objects;

public class Weight {
    public enum Unit{ GRAM, KILOGRAM, TONNE};

    private final Unit unit;
    public final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 &&
                unit == weight.unit;
    }
}
