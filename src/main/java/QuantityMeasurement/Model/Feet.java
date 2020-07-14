package QuantityMeasurement.Model;

public class Feet {
    public String variable;
    public double value;

    public Feet(double value) {
        this.value = value;
    }

    public Feet(String variable) {
        this.variable = variable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

}
