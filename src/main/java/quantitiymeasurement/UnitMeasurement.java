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

    public boolean compare(UnitMeasurement thatUnit) {
        if (this.unit.getClass() != thatUnit.unit.getClass())
            return false;
        if (this.unit.equals(thatUnit.unit))
            return this.equals(thatUnit.unit);
        return Double.compare(this.unit.convertToBaseUnit(this.value),
                thatUnit.unit.convertToBaseUnit(thatUnit.value)) == 0;
    }
}
