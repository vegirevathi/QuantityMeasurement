package QuantityMeasurement.Model;

public class Inch {
    public String variable;
    public double value;

    public Inch(double value) {
        this.value = value;
    }

    public Inch(String variable) {
        this.variable = variable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

}
