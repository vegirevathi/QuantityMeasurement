package QuantityMeasurement.Model;

public class Centimeter {
    public double value;

    public Centimeter(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(that.value, value) == 0;
    }
}
