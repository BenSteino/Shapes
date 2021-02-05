/**
 * 
 */
package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author bensteinmetz
 *
 */
public class Cuboid extends Shape {
	
	// Variables
	private float width;
	private float height;
	private float depth;
		
	
	// Constructor
	public Cuboid(float width, float height, float depth) {
		// validation
		if (width > 0) {
			this.width = width;
		} else {
			this.width = 0;
		}
		if (height > 0) {
			this.height = height;
		} else {
			this.height = 0;
		}
		if (depth > 0.0) {
			this.depth = depth;
		} else {
			this.depth = 0;
		}
		
	}
	
	
	// Getters and Setters
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}


	@Override
	// Surface Area calculation
	public float surfaceArea() {
		return (2 * ((width * height) + (height * depth) + (width * depth)));
		
	}


	@Override
	// Volume calculation
	public float volume() {
		return depth * height * width;
	}


	@Override
	public void render() {
		// Message box
		// Default title and icon
		JOptionPane.showMessageDialog(null,
		    "Cuboid Dimensions: " + 
		    "\nHeight = " + height + 
		    "\nWidth = " + width + 
		    "\nDepth = " + depth +
		    "\nSurface Area = " + surfaceArea() +
		    "\nVolume = " + volume());
		
	}
	
	

}
