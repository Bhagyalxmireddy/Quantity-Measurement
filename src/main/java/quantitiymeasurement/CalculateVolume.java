package quantitiymeasurement;

public enum CalculateVolume implements MeasurementUnits {
    GALLON(3.78),LITRE(1.0),MILLI_LITRE(0.001);

    private final double baseConversionValue;

    CalculateVolume(double baseConversionValue) {
        this.baseConversionValue = baseConversionValue;
    }
    @Override
    public double convertToBaseUnit(double value) {
        return value*baseConversionValue;
    }
    @Override
    public boolean additionOfLengths() {
        return true;
    }
}
