/**
 * 
 */
package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author bensteinmetz
 *
 */
public class Cylinder extends Shape {
	
	// Variables 
	private float radius;
	private float height;
	
	
	
	// Constructor
	public Cylinder(float radius, float height) {
		// Validation
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
		if (height > 0) {
			this.height = height;
		} else {
			this.height = 0;
		}
		
	}
	
	
	// Getters and Setters
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}


	@Override
	// Surface Area calculation
	public float surfaceArea() {
		return (float) (2 * (Math.PI * radius * height) + 2 * (Math.PI * Math.pow(radius, 2)));
		
	}


	@Override
	// Volume calculation
	public float volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
		
	}


	@Override
	public void render() {
		// Message box
		// Default title and icon
		JOptionPane.showMessageDialog(null, 
				"Cylinder dimensions: " + 
				"\nRadius = " + radius + 
				"\nHeight = " + height +
				"\nSurface Area = " + surfaceArea() +
				"\nVolume = " + volume());
		
	}
	
	

}
