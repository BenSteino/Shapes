/**
 * 
 */
package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author bensteinmetz
 *
 */
public class Sphere extends Shape {
	
	// Variables
	private float radius;
	
	
	// Constructor
	public Sphere(float radius) {
		// Validation
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
		
	}

	
	// Getters and Setters 
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}


	@Override
	// Surface Area calculation
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(radius, 2));
		
	}


	@Override
	// Volume calculation
	public float volume() {
		return (float) ((4.0/3) * Math.PI * Math.pow(radius, 3));
		
	}


	@Override
	public void render() {
		// Message box
		// Default title and icon
		JOptionPane.showMessageDialog(null, 
				"Sphere dimensions: " + 
				"\nRadius = " + radius + 
				"\nSurface Area = " + surfaceArea() + 
				"\nVolume = " + volume());
		
	}


}
