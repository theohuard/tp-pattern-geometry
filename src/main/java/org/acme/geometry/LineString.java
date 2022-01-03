package org.acme.geometry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineString implements Geometry {
    
    private List<Point> points =new ArrayList<Point>();

    @Override
    public String getType() {
        return "linestring";
    }

    public LineString(){
        this.points=Collections.emptyList();
    }

    public LineString(List<Point> points){
        assert (points != null);
        this.points=points;
    }

    public int getNumPOints(){
        return points.size();
    }

    public Point getPointN(int n){
        return points.get(n);
    }

    @Override
    public boolean isEmpty() {
        if (points.isEmpty()){
            return true;
            }
        return false;
    }

    @Override
    public void translate(double xt, double yt) {
        List<Point> nw_points =new ArrayList<Point>();
        for ( Point point : points) {
            Coordinate coord=point.getCoordinate();       
            double x = coord.getX();
            double y = coord.getY();

            Coordinate coord2 = new Coordinate(x+xt, y+yt);
            Point pt = new Point(coord2);
            nw_points.add(pt);
        }
        this.points=nw_points;
    }

    @Override
    public Geometry clone(){
        return new LineString(this.coordinate);
    }
   
}
