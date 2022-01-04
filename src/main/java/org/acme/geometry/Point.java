package org.acme.geometry;


public class Point implements Geometry {
    private Coordinate coordinate;

    public Point(){
        this.coordinate=new Coordinate();
    };

    public Point(Coordinate coord){
        this.coordinate=coord;
    }

    @Override
    public String getType() {
        return "point";
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Override
    public boolean isEmpty() {
        if (coordinate.isEmpty()){
            return true;
        }
        return false; 
    }

    @Override
    public void translate(double xt, double yt) {
        
        double x = coordinate.getX();
        double y = coordinate.getY();
        Coordinate coord2 = new Coordinate(x+xt, y+yt);
        this.coordinate=coord2;
    }

    @Override
    public Geometry clone(){
        return new Point(this.coordinate);
    }

}
