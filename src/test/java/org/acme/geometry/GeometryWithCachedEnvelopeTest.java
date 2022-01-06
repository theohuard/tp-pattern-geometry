package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryWithCachedEnvelopeTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    public void testCachedEnvelope() {

        Geometry g = new Point(new Coordinate(3.0,3.0));
        // décoration
        g = new GeometryWithCachedEnvelope(g);
        Envelope a = g.getEnvelope() ; // calcul et stockage dans cachedEnvelope
        Envelope b = g.getEnvelope() ; // renvoi de cachedEnvelope
        Assert.assertSame(a,b);
    }

   
}