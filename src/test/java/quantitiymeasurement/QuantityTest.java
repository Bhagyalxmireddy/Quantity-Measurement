package quantitiymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0Feet0Feet_ShouldReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void given0Feet1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }
    @Test
    public void given0Inch0Inch_ShouldReturnEqual(){
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }
    @Test
    public void given0Inch1Inch_ShouldReturnEqual(){
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }
}
