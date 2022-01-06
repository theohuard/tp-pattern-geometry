package org.acme.geometry;

public class EnvelopeBuilder {
    private double minX;
    private double minY;
    private double maxX;
    private double maxY;


    public EnvelopeBuilder(){
        this.minX=0.0;
        this.minY=0.0;
        this.maxX=0.0;
        this.maxY=0.0;
    }


    public void insert(Coordinate coordinate){

        double x = coordinate.getX() ; double y = coordinate.getY();

        if (minX == 0.0){
            this.minX=x ; this.maxX=x ; 
            this.minY=y ; this.maxY=y ; 
        }
        if (x > this.maxX ) { this.maxX = x;}
        if (x < this.minX ) { this.minX = x;}
        
        if (y > this.maxY ) { this.maxY = y;}
        if (y < this.minY ) { this.minY = y;}
    }

    public Envelope build(){
        Coordinate coord1= new Coordinate(this.minX,this.minY) ; 
        Coordinate coord2= new Coordinate(this.maxX,this.maxY) ;
        return new Envelope(coord1, coord2);
    }
}
