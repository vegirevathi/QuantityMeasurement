package QuantityMeasurement.Model;

import java.util.Objects;

public class Volume {
    public final Unit unit;
    public final double value;

    public enum Unit{ GALLON, LITRE}

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 &&
                unit == volume.unit;
    }
}
