package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
    
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructor() {
        LineString l = new LineString();
        Assert.assertEquals(0, l.getNumPoints());
		Assert.assertTrue(l.isEmpty());
    }

    @Test
    public void testConstructor() {
        LineString l =  FactoryForTest.createLineStringTest();

        Assert.assertEquals(2, l.getNumPoints());
        Assert.assertEquals(1.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(2.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(3.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.0, l.getPointN(1).getCoordinate().getY(), EPSILON);
		Assert.assertFalse(l.isEmpty());
    }

    @Test
    public void testTranslate() {
        LineString l =  FactoryForTest.createLineStringTest();

        l.translate(2.0, 2.0);
        Assert.assertEquals(3.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(5.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(6.0, l.getPointN(1).getCoordinate().getY(), EPSILON);
		Assert.assertFalse(l.isEmpty());
    }

    @Test
    public void testClone() {
        LineString l =  FactoryForTest.createLineStringTest();

        LineString lc = (LineString) l.clone();
        l.translate(2.0, 2.0);

        Assert.assertEquals(3.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(5.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(6.0, l.getPointN(1).getCoordinate().getY(), EPSILON);


        Assert.assertEquals(1.0,lc.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(2.0, lc.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(3.0, lc.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.0, lc.getPointN(1).getCoordinate().getY(), EPSILON);
        Assert.assertTrue(l != lc);
    }

    @Test
    public void testGetEnvelope() {
        LineString l =  FactoryForTest.createLineStringTest();

        Envelope envelope = l.getEnvelope();
        Assert.assertEquals(1.0, envelope.getXmin(), EPSILON);
        Assert.assertEquals(2.0, envelope.getYmin(), EPSILON);
        Assert.assertEquals(3.0, envelope.getXmax(), EPSILON);
        Assert.assertEquals(4.0, envelope.getYmax(), EPSILON);
    }
}