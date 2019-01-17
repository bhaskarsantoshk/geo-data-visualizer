package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{
	public void setup() {
		size(400,400);
		background(200,200,200);
		
	}
	public void draw() {
		fill(255,255,0);
		ellipse(width/2, height/2, width, height);
		fill(0,0,0);
		ellipse(120, height/3, width/10, height/8);
		ellipse(280, height/3, width/10, height/8);
		noFill();
		arc(200, 280, 75, 75, 0, PI);
	}
}
