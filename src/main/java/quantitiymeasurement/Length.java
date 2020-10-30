package quantitiymeasurement;

public class Length {
    private static final double FEET_TO_INCH = 12.0 ;
    private static final double YARD_TO_FEET = 3.0;
    private static final double YARD_TO_INCH = 36.0;

    enum Unit{
        FEET,INCH,YARD
    };
    private final Unit unit;
    private final double value;

    public Length(Unit unit,double value) {
        this.unit = unit;
        this.value = value;
    }
    public boolean compare(Length that) {
        if(this.unit.equals(unit.FEET) && that.unit.equals(unit.FEET))
            return Double.compare(this.value,that.value) == 0;
        if(this.unit.equals(unit.INCH) && that.unit.equals(unit.INCH))
            return Double.compare(this.value,that.value) == 0;
        if(this.unit.equals(unit.YARD) && that.unit.equals(unit.YARD))
            return Double.compare(this.value,that.value) == 0;
        if(this.unit.equals(unit.YARD) && that.unit.equals(unit.FEET))
            return Double.compare(this.value*YARD_TO_FEET,that.value) == 0;
        if(this.unit.equals(unit.FEET) && that.unit.equals(unit.YARD))
            return Double.compare(this.value/YARD_TO_FEET,that.value) == 0;
        if(this.unit.equals(unit.YARD) && that.unit.equals(unit.INCH))
            return Double.compare(this.value*YARD_TO_INCH,that.value) == 0;
        if(this.unit.equals(unit.INCH) && that.unit.equals(unit.YARD))
            return Double.compare(this.value/YARD_TO_INCH,that.value) == 0;
        if(this.unit.equals(unit.INCH) && that.unit.equals(unit.FEET))
            return Double.compare(this.value/FEET_TO_INCH,that.value) == 0;
        if(this.unit.equals(unit.FEET) && that.unit.equals(unit.INCH))
        return Double.compare(this.value*FEET_TO_INCH,that.value) == 0;
        return false;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value,value) == 0 && unit == length.unit;
    }
}
