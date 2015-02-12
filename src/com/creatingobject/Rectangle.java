package com.creatingobject;

import java.awt.Point;

public class Rectangle {
	public int width;
	public int height;
	public Point origin;
	//four constructors
	public Rectangle(){
		origin = new Point(0,0);
	}
	public Rectangle(Point p){
		origin = p;
	}
	public Rectangle(int w , int h){
		width = w;
		height = h;
	}
	public Rectangle(Point p, int w, int h){
		origin = p;
		width = w;
		height = h;
	}
	//a method for moving the rectangle
	public void move(int x, int y){
		origin.x=x;
		origin.y=y;
	}
	//a method for computing the are of the rectangle
	public int getArea(){
		 int area = width*height;
		 return area;
	}
	

}
