package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Test;

public class LogGeometryVisitorTest {

    @Test
    public void testVisitPoint() throws UnsupportedEncodingException{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);

        Point point = new Point(new Coordinate(1.23,4.56));
        point.accept(visitor);

        out.println("Je suis un point avec x=1.23 et y=4.56");
        String result = os.toString("UTF8");
        String[] results = result.split("\n");

        Assert.assertEquals(results[1], results[0]);
    }
    
    @Test
    public void testVisitLineString() throws UnsupportedEncodingException{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);

        LineString lineString = FactoryForTest.createLineStringTest();
        lineString.accept(visitor);

        out.println("Je suis une polyligne définie par 2 points.");
        String result = os.toString("UTF8");
        String[] results = result.split("\n");

        Assert.assertEquals(results[1], results[0]);
    }
}