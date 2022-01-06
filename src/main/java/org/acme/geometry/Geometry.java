package org.acme.geometry;

public interface Geometry {
    
    public String getType(); 
    
    public boolean isEmpty();

    public void translate(double xt, double yt);

    public Geometry clone();

    public Envelope getEnvelope(); 

    public void accept(GeometryVisitor visitor);

}
