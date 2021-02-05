/**
 * 
 */
package edu.cvtc.java;

/**
 * @author bensteinmetz
 *
 */
public class ShapesTest {

	public static void main(String[] args) {
		
		// Creating new objects
		Cuboid newCuboid = new Cuboid(3, 4, 5);
		Cylinder newCylinder = new Cylinder(0, 0);
		Sphere newSphere = new Sphere(0);
		
		
		// Calling render method for the shapes
		newCuboid.render();
		newCylinder.render();
		newSphere.render();

	}

}
