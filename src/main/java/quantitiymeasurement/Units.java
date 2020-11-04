package quantitiymeasurement;

public enum Units implements MeasurementUnits {
    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4),
    GALLON(3.78),LITRE(1.0),MILLI_LITRE(0.001),
    KILOGRAM(1.0),TONNE(1000.0),GRAM(0.001);

    private final double baseConversionValue;

    Units(double baseConversionValue) {
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

