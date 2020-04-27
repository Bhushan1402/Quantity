package com.measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void givenOFeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenOFeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenOInchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenOInchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void given0FeetAnd1Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = QuantityMeasurement.compare(feet1,inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = QuantityMeasurement.compare(feet1,inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = QuantityMeasurement.compare(feet1,feet2);
        Assert.assertTrue(compareCheck);
    }


    @Test
    public void givenFeetAndInchAndSameRef_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
       // Length feet2 = null;
        boolean compareCheck = QuantityMeasurement.compare(feet1,feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        boolean compareCheck = QuantityMeasurement.compare(feet1,inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.INCH,0.0);
        Length inch1 = null;
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length( Length.Unit.FEET,3);
        Length length2 = new Length( Length.Unit.YARD,1);
        boolean comparision = QuantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenLengthsInYardAndFeet_WhenEqual_ShouldReturnTrue() {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.FEET,3);
        boolean comparision = QuantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenLengthsInYardAndInch_WhenEqual_ShouldReturnTrue() {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.INCH,36);
        boolean comparision = QuantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void given1YardAnd1Feet_WhenEqual_ShouldReturnFalse() {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.FEET,1);
        boolean comparision = QuantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, comparision);
    }

    @Test
    public void given1YardAnd1Inch_WhenEqual_ShouldReturnFalse() {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.INCH,1);
        boolean comparision = QuantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, comparision);
    }

    @Test
    public void givenYardAndInch_WhenEqual_ShouldReturnFalse() {
        Length length2 = new Length(Length.Unit.INCH,36);
        Length length1 = new Length(Length.Unit.YARD,1);
        boolean comparision = QuantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(Length.Unit.INCH,2);
        Length length2 = new Length( Length.Unit.CENTIMETRE,5);
        boolean comparision = QuantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(Length.Unit.INCH,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,5);
        boolean comparision = QuantityMeasurement.compare(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue_2() {
        Length length1 = new Length(Length.Unit.INCH,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,0);
        boolean comparision = QuantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(Length.Unit.FEET,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,5);
        boolean comparision = QuantityMeasurement.compare(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,1);
        Length length2 = new Length(Length.Unit.CENTIMETRE,30);
        boolean comparision = QuantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(Length.Unit.YARD,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,5);
        boolean comparision = QuantityMeasurement.compare(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenEqual_ShouldReturnTrue() {
        Length length1 = new Length(Length.Unit.YARD,1);
        Length length2 = new Length(Length.Unit.CENTIMETRE,90);
        boolean comparision = QuantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }
}
