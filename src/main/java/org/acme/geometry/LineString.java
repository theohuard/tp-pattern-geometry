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
        this.points=points;
    }

    public int getNumPOints(){
        return points.size();
    }

    public Point getPointN(int n){
        return points.get(n);
    }
    


    
    
}
