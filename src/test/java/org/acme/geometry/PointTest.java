package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructor() {

        Point point = new Point();
        Assert.assertEquals(Double.NaN, point.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(Double.NaN, point.getCoordinate().getY(), EPSILON);
		Assert.assertTrue(point.isEmpty());
    }

    @Test
    public void testConstructor() {
        Point point = new Point(new Coordinate(1.23,4.56));

        Assert.assertEquals(1.23, point.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.56, point.getCoordinate().getY(), EPSILON);
		Assert.assertFalse(point.isEmpty());
    }

    @Test
    public void testTranslate() {
        Point point = new Point(new Coordinate(1.23,4.56));

        point.translate(2, 2);
        Assert.assertEquals(3.23, point.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(6.56, point.getCoordinate().getY(), EPSILON);
		Assert.assertFalse(point.isEmpty());
    }

    @Test
    public void testClone() {
        Point point = new Point(new Coordinate(1.23,4.56));

        Point pc = (Point) point.clone();
        point.translate(2.0, 2.0);

        Assert.assertEquals(3.23, point.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(6.56, point.getCoordinate().getY(), EPSILON);

        Assert.assertEquals(1.23, pc.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.56, pc.getCoordinate().getY(), EPSILON);
        Assert.assertTrue(point != pc);
    }

    @Test
    public void testGetEnvelope() {
        Point point = new Point(new Coordinate(1.23,4.56));

        Envelope envelope = point.getEnvelope();
        Assert.assertEquals(1.23, envelope.getXmin(), EPSILON);
        Assert.assertEquals(1.23, envelope.getXmax(), EPSILON);

        Assert.assertEquals(4.56, envelope.getYmin(), EPSILON);
        Assert.assertEquals(4.56, envelope.getYmax(), EPSILON);

    }
    
}
