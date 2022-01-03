package org.acme.geometry;

public class Coordinate {
	private double x;
	private double y; 
	
	public Coordinate(){
		this.x=0.0;
		this.y=0.0;
	}
	
	public Coordinate(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
}
