package org.acme.geometry;

public class WktWriter {
    
    public String write (Geometry geometry){

        if ( geometry instanceof Point ){
            Point point = (Point)geometry;
            String x=Double.toString(point.getCoordinate().getX());
            String y=Double.toString(point.getCoordinate().getY());

            return "POINT("+x+" "+y+")";

        }else if ( geometry instanceof LineString ){
            LineString lineString = (LineString)geometry;
            
            String wkt = "LINESTRING(";
            for (int i = 0; i < lineString.getNumPoints(); i++){
                Point point = lineString.getPointN(i);
                wkt += point.getCoordinate().getX() + " " + point.getCoordinate().getY();

                if (i == lineString.getNumPoints() -1) { return wkt+=")";}

                wkt+=",";
            }
            
        }else{
            throw new RuntimeException("geometry type not supported");
            
        }
        return new String();
    }
}
