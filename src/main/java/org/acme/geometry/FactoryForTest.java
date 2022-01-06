package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class FactoryForTest {

    public static LineString createLineStringTest(){
        
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(new Coordinate(1.0,2.0)));
        points.add(new Point(new Coordinate(3.0,4.0)));

        return new LineString(points);
    }
    
}
