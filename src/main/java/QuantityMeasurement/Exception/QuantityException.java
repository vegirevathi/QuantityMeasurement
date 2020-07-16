package QuantityMeasurement.Exception;

public class QuantityException extends Throwable {
    private final ExceptionType type;

    public enum ExceptionType {NEGATIVE_UNIT_VALUE}

    public QuantityException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
