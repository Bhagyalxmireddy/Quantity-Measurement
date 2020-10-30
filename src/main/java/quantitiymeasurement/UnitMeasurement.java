package quantitiymeasurement;

public class UnitMeasurement {
    private double value;
    private MeasurementUnits unit;

    public UnitMeasurement(MeasurementUnits unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurement quantity = (UnitMeasurement) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }

    public boolean compare(UnitMeasurement that) {
        if (this.unit.getClass() != that.unit.getClass())
            return false;
        if (this.unit.equals(that.unit))
            return this.equals(that.unit);
        return Double.compare(this.unit.convertToBaseUnit(this.value),
                that.unit.convertToBaseUnit(that.value)) == 0;
    }
    public double add(UnitMeasurement that) {
        if(this.unit.getClass() != that.unit.getClass() ||
                !this.unit.additionOfLengths() || !that.unit.additionOfLengths())
            return  0.0;
        return this.unit.convertToBaseUnit(this.value) +
                that.unit.convertToBaseUnit(that.value);
    }
}
