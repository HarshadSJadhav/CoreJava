package com.tns.abstraction;

abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {       //we need to follow the same method compulsary 
		System.out.println("Drawing rectangle..");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle..");
	}
}


public class TestAbstraction {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
		Circle c= new Circle();
		c.draw();
	}

}
