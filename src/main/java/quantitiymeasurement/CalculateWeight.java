package quantitiymeasurement;

public enum CalculateWeight implements MeasurementUnits {
   KILOGRAM(1.0),TONNE(1000.0),GRAM(0.001) ;

    private final double baseConversionValue    ;

    CalculateWeight(double baseConversionValue) {
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
