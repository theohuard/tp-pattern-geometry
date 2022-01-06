package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {
    
   

    @Test
    public void testWriteEmptyPoint() {
        WktWriter wktWriter = new WktWriter();
        Point pt = new Point();
        
        Assert.assertEquals("X", wktWriter.write(pt));
    }

    @Test
    public void testWritePoint() {
        WktWriter wktWriter = new WktWriter();
        Point pt = new Point(new Coordinate(1.00,2.00));
        
        Assert.assertEquals("POINT(1.0 2.0)", wktWriter.write(pt));
    }

    @Test
    public void testWriteEmptyLineString() {
        WktWriter wktWriter = new WktWriter();
        LineString l = new LineString();
        
        Assert.assertEquals("X", wktWriter.write(l));
    }

    @Test
    public void testWriteLineString() {
        WktWriter wktWriter = new WktWriter();
        LineString l = FactoryForTest.createLineStringTest();
        
        Assert.assertEquals("LINESTRING(1.0 2.0,3.0 4.0)", wktWriter.write(l));
    }

}