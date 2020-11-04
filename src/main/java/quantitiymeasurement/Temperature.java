package quantitiymeasurement;

import java.util.function.Function;

public enum Temperature implements MeasurementUnits {
    FAHRENHEIT(true), CELSIUS(false);

    final Function<Double, Double> degreeFahrenheitToCelsius = (Double degF) ->(degF.doubleValue()-32)*5/9;
    final Function<Double, Double> degreeCelsiusToFahrenheit = (Double degC) -> degC.doubleValue();

    final Function<Double, Double> baseConversionValue;
    private Temperature(boolean isFahrenheit) {
        if(isFahrenheit) this.baseConversionValue  = degreeFahrenheitToCelsius;
        else this.baseConversionValue = degreeCelsiusToFahrenheit;
    }
    @Override
    public double convertToBaseUnit(double value) {
        return baseConversionValue.apply(value);
    }
    @Override
    public boolean additionOfLengths() {
        return true;
    }
}
