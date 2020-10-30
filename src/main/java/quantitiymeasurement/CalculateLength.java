package quantitiymeasurement;

public enum CalculateLength implements MeasurementUnits {
    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4);

    private final double baseConversionValue;

    CalculateLength(double baseConversionValue) {

        this.baseConversionValue = baseConversionValue;
    }


    @Override
    public double convertToBaseUnit(double value) {

        return value*baseConversionValue;
    }
}

