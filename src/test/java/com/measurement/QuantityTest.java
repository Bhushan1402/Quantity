package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {

    QuantityMeasurement quantityMeasurement = null;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }


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
    public void given0FeetAnd1Inch_ShouldReturnEqualLength() throws QuantityMeasurementException {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = quantityMeasurement.compare(feet1,inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() throws QuantityMeasurementException {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = quantityMeasurement.compare(feet1,inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnEqualLength() throws QuantityMeasurementException {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = quantityMeasurement.compare(feet1,feet2);
        Assert.assertTrue(compareCheck);
    }


    @Test
    public void givenFeetAndInchAndSameRef_WhenCompared_ShouldReturnEqualLength() throws QuantityMeasurementException {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
       // Length feet2 = null;
        boolean compareCheck = quantityMeasurement.compare(feet1,feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqualLength() throws QuantityMeasurementException {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        boolean compareCheck = quantityMeasurement.compare(feet1,inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.INCH,0.0);
        Length inch1 = null;
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length length1 = new Length( Length.Unit.FEET,3);
        Length length2 = new Length( Length.Unit.YARD,1);
        boolean comparision = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenLengthsInYardAndFeet_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.FEET,3);
        boolean comparision = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenLengthsInYardAndInch_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.INCH,36);
        boolean comparision = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void given1YardAnd1Feet_WhenEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.FEET,1);
        boolean comparision = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, comparision);
    }

    @Test
    public void given1YardAnd1Inch_WhenEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Length length2 = new Length(Length.Unit.YARD,1);
        Length length1 = new Length(Length.Unit.INCH,1);
        boolean comparision = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(false, comparision);
    }

    @Test
    public void givenYardAndInch_WhenEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Length length2 = new Length(Length.Unit.INCH,36);
        Length length1 = new Length(Length.Unit.YARD,1);
        boolean comparision = quantityMeasurement.compare(length1, length2);
        Assert.assertEquals(true, comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.INCH,2);
        Length length2 = new Length( Length.Unit.CENTIMETRE,5);
        boolean comparision = quantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.INCH,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,5);
        boolean comparision = quantityMeasurement.compare(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndInch_WhenEqual_ShouldReturnTrue_2() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.INCH,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,0);
        boolean comparision = quantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.FEET,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,5);
        boolean comparision = quantityMeasurement.compare(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndFeet_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.FEET,1);
        Length length2 = new Length(Length.Unit.CENTIMETRE,30);
        boolean comparision = quantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.YARD,0);
        Length length2 = new Length(Length.Unit.CENTIMETRE,5);
        boolean comparision = quantityMeasurement.compare(length2, length1);
        Assert.assertFalse(comparision);
    }

    @Test
    public void givenCentimetreAndYard_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.YARD,1);
        Length length2 = new Length(Length.Unit.CENTIMETRE,90);
        boolean comparision = quantityMeasurement.compare(length2, length1);
        Assert.assertTrue(comparision);
    }
    @Test
    public void givenInchAndInch_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.INCH,2);
        Length length2 = new Length(Length.Unit.INCH,2);
        double totalLength = quantityMeasurement.addLengths(length1,length2);
        Assert.assertEquals(new Length(Length.Unit.INCH,4),totalLength);
    }

    @Test
    public void givenFeetAndInch_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.FEET,1);
        Length length2 = new Length(Length.Unit.INCH,2);
        double totalLength = quantityMeasurement.addLengths(length1,length2);
        Assert.assertEquals(new Length(Length.Unit.INCH,14),totalLength);
    }

    @Test
    public void givenFeetAndFeet_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.FEET,1);
        Length length2 = new Length(Length.Unit.FEET,1);
        double totalLength = quantityMeasurement.addLengths(length1,length2);
        Assert.assertEquals(new Length(Length.Unit.INCH,24),totalLength);
    }

    @Test
    public void givenCentimeterAndInch_WhenAdded_ShouldReturnValueInInch() throws QuantityMeasurementException {
        Length length1 = new Length(Length.Unit.CENTIMETRE,2.5);
        Length length2 = new Length(Length.Unit.INCH,2);
        double totalLength = quantityMeasurement.addLengths(length1,length2);
        Assert.assertEquals(new Length(Length.Unit.INCH,3),totalLength);
    }


    @Test
    public void givenVolume_InGallonAndLitre_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length volume1 = new Length(Length.Unit.GALLON,1);
        Length volume2 = new Length(Length.Unit.LITRE,3.78);
        boolean compare = quantityMeasurement.compare(volume1, volume2);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenVolume_InLiterAndMiliLitre_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length volume1 = new Length(Length.Unit.LITRE,1);
        Length volume2 = new Length(Length.Unit.MILLILITRE,1000);
        boolean compare = quantityMeasurement.compare(volume1, volume2);
        Assert.assertEquals(true, compare);
    }

    @Test
    public void givenVolume_InGallonAndLitre_WhenAdd_ShouldReturnCorrect() throws QuantityMeasurementException {
        Length volume1 = new Length(Length.Unit.GALLON,1);
        Length volume2 = new Length(Length.Unit.LITRE,3.78);
        double totalLength = quantityMeasurement.addLengths(volume1, volume2);
        Assert.assertEquals(new Length(Length.Unit.LITRE,7.56),new Length(Length.Unit.LITRE,totalLength));
    }

    @Test
    public void givenVolume_InLiterAndMiliLitre_WhenAdd_ShouldReturnCorrect() throws QuantityMeasurementException {
        Length volume1 = new Length(Length.Unit.LITRE,1);
        Length volume2 = new Length(Length.Unit.MILLILITRE,1000);
        double totalLength = quantityMeasurement.addLengths(volume1, volume2);
        Assert.assertEquals(new Length(Length.Unit.LITRE,2),new Length(Length.Unit.LITRE,totalLength));
    }

    @Test
    public void givenVolume_InKilogramAndGram_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length volume1 = new Length(Length.Unit.KILOGRAM,1);
        Length volume2 = new Length(Length.Unit.GRAM,1000);
        boolean totalLength = quantityMeasurement.compare(volume1, volume2);
        Assert.assertEquals(true,totalLength);
    }

    @Test
    public void givenVolume_InTonneAndKiloGram_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length volume1 = new Length(Length.Unit.TONNE,1);
        Length volume2 = new Length(Length.Unit.KILOGRAM,1000);
        boolean totalLength = quantityMeasurement.compare(volume1, volume2);
        Assert.assertEquals(true,totalLength);
    }

    @Test
    public void givenVolume_InTonneAndGram_WhenAdd_ShouldReturnCorrect() throws QuantityMeasurementException {
        Length volume1 = new Length(Length.Unit.TONNE,1);
        Length volume2 = new Length(Length.Unit.GRAM,1000);
        double totalLength = quantityMeasurement.addLengths(volume1, volume2);
        Assert.assertEquals(new Length(Length.Unit.KILOGRAM,1001),new Length(Length.Unit.KILOGRAM,totalLength));
    }
}
