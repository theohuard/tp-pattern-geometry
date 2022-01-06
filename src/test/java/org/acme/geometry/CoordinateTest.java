package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		
		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
		Assert.assertTrue(c.isEmpty());
	}
	
	@Test
	public void testConstructor(){

		Coordinate coord = new Coordinate(1.23, 4.56);
		Assert.assertEquals(1.23, coord.getX(), EPSILON);
		Assert.assertEquals(4.56, coord.getY(), EPSILON);

		Assert.assertFalse(coord.isEmpty());
	}

}
