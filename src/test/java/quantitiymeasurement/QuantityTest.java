package quantitiymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0Feet0Feet_ShouldReturnEqual(){
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,0.0);
        UnitMeasurement feet2 = new UnitMeasurement(CalculateLength.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void given0Feet1Feet_ShouldReturnNotEqual() {
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,0.0);
        UnitMeasurement feet2 = new UnitMeasurement(CalculateLength.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }
    @Test
    public void given0Inch0Inch_ShouldReturnEqual(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,0.0);
        UnitMeasurement inch2 = new UnitMeasurement(CalculateLength.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    @Test
    public void given0Inch1Inch_ShouldReturnEqual(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,0.0);
        UnitMeasurement inch2 = new UnitMeasurement(CalculateLength.INCH,1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual(){
        UnitMeasurement feet2 = new UnitMeasurement(CalculateLength.FEET,1.0);
        UnitMeasurement inch2 = new UnitMeasurement(CalculateLength.INCH,1.0);
        Assert.assertNotEquals(feet2,inch2);
    }
    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength(){
        UnitMeasurement feet2 = new UnitMeasurement(CalculateLength.FEET,0.0);
        UnitMeasurement inch2 = new UnitMeasurement(CalculateLength.INCH,0.0);
        boolean comparecheck = feet2.compare(inch2);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        UnitMeasurement feet2 = new UnitMeasurement(CalculateLength.FEET,1.0);
        UnitMeasurement inch2 = new UnitMeasurement(CalculateLength.INCH,1.0);
        boolean comparecheck = feet2.compare(inch2);
        Assert.assertFalse(comparecheck);

    }
    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,12.0);
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,1.0);
        boolean comparecheck = inch1.compare(feet1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,1.0);
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,12.0);
        boolean comparecheck = feet1.compare(inch1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given0Yard0Yard_ShouldReturnEqual(){
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,0.0);
        UnitMeasurement yard2 = new UnitMeasurement(CalculateLength.YARD,0.0);
        Assert.assertEquals(yard1,yard2);
    }
    @Test
    public void given0Yard1Yard_ShouldReturnEqual(){
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,0.0);
        UnitMeasurement yard2 = new UnitMeasurement(CalculateLength.YARD,1.0);
        boolean equals = yard1.equals(yard2);
        Assert.assertFalse(equals);
    }
    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual(){
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,1.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        Assert.assertNotEquals(feet1,yard1);
    }
    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,1.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        Assert.assertNotEquals(inch1,yard1);
    }
    @Test
    public void given0FeetAnd0Yard_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,0.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,0.0);
        boolean comparecheck = feet1.compare(yard1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given0InchAnd0Yard_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,0.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,0.0);
        boolean comparecheck = inch1.compare(yard1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1FeetAnd1Yard_WhenCompare_ShouldReturnNotEqual(){
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,1.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        boolean comparecheck = feet1.compare(yard1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void given1InchAnd1Yard_WhenCompare_ShouldReturnNotEqual(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,1.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        boolean comparecheck = inch1.compare(yard1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void given1YardAnd3Feet_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,3.0);
        boolean comparecheck = yard1.compare(feet1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given3FeetAnd1Yard_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,3.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        boolean comparecheck = feet1.compare(yard1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1YardAnd36Inch_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,36.0);
        boolean comparecheck = yard1.compare(inch1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given36InchAnd1Yard_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,36.0);
        UnitMeasurement yard1 = new UnitMeasurement(CalculateLength.YARD,1.0);
        boolean comparecheck = inch1.compare(yard1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1InchAnd04Cm_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,0.394);
        UnitMeasurement cm1 = new UnitMeasurement(CalculateLength.CM,1.0);
        boolean comparecheck = inch1.compare(cm1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inchs(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,2.0);
        UnitMeasurement inch2 = new UnitMeasurement(CalculateLength.INCH,2.0);
        double result = inch1.add(inch2);
        Assert.assertEquals(4.0,result,0.0);
    }
    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inchs(){
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,1.0);
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,2.0);
        double result = feet1.add(inch1);
        Assert.assertEquals(14.0,result,0.0);
    }
    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inchs(){
        UnitMeasurement feet1 = new UnitMeasurement(CalculateLength.FEET,1.0);
        UnitMeasurement feet2 = new UnitMeasurement(CalculateLength.FEET,1.0);
        double result = feet1.add(feet2);
        Assert.assertEquals(24.0,result,0.0);
    }
    @Test
    public void given2InchAndHalfInch_WhenAdded_ShouldReturn3Inchs(){
        UnitMeasurement inch1 = new UnitMeasurement(CalculateLength.INCH,2.0);
        UnitMeasurement cm1 = new UnitMeasurement(CalculateLength.CM,2.5);
        double result = inch1.add(cm1);
        Assert.assertEquals(3.0,result,0.0);
    }
    @Test
    public void given1GallonAnd3_78Litre_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement gallon1 = new UnitMeasurement(CalculateVolume.GALLON,1.0);
        UnitMeasurement litre1 = new UnitMeasurement(CalculateVolume.LITRE,3.78);
        boolean compareCheck = gallon1.compare(litre1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1LitreAnd1000Millelitre_WhenCompare_ShouldReturnEqual(){
        UnitMeasurement litre1 = new UnitMeasurement(CalculateVolume.LITRE,1.0);
        UnitMeasurement milliLITRE1 = new UnitMeasurement(CalculateVolume.MILLI_LITRE,1000.0);
        boolean compareCheck = litre1.compare(milliLITRE1);
        Assert.assertTrue(compareCheck);
    }
}
