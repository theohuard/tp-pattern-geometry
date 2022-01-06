package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktVisitorTest {

    @Test
    public void testVisitDefaultPoint(){
        Point pt = new Point();
        WktVisitor visitor = new WktVisitor();
        pt.accept(visitor);
        Assert.assertEquals("X", visitor.getResult());
    }

    @Test
    public void testVisitPoint(){
        Point pt = new Point(new Coordinate(1.0,2.0));

        WktVisitor visitor = new WktVisitor();
        pt.accept(visitor);

        Assert.assertEquals("POINT(1.0 2.0)", visitor.getResult());
    }

    @Test
    public void testVisitDefaultLineString(){
        LineString l = new LineString();

        WktVisitor visitor = new WktVisitor();
        l.accept(visitor);

        Assert.assertEquals("X", visitor.getResult());
    }

    @Test
    public void testVisitLineString(){
        LineString l = FactoryForTest.createLineStringTest();

        WktVisitor visitor = new WktVisitor();
        l.accept(visitor);

        Assert.assertEquals("LINESTRING(1.0 2.0,3.0 4.0)", visitor.getResult());
    }
}