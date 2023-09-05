package com.tns.polymorphism;
class Shape{
	void draw() {                                     
		System.out.println("cant define Shape");
	}
}
class square extends Shape{
	@Override
	void draw() {
		System.out.println("this is sqaure");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		square obj=new square();
		obj.draw();

	}

}
