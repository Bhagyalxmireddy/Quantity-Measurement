package quantitiymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0Feet0Feet_ShouldReturnEqual(){
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void given0Feet1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }
    @Test
    public void given0Inch0Inch_ShouldReturnEqual(){
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }
    @Test
    public void given0Inch1Inch_ShouldReturnEqual(){
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual(){
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(feet2,inch2);
    }
    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength(){
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean comparecheck = feet2.compare(inch2);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean comparecheck = feet2.compare(inch2);
        Assert.assertFalse(comparecheck);

    }
    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean comparecheck = feet1.compare(feet2);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean comparecheck = inch1.compare(inch2);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        boolean comparecheck = inch1.compare(feet1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        boolean comparecheck = feet1.compare(inch1);
        Assert.assertTrue(comparecheck);
    }
}
