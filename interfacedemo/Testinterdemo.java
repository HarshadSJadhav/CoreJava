package com.tns.interfacedemo;

interface Printable{
	void print();
}
interface showable {
	void show();
}
class Demo implements Printable,showable{
	public void print() {
	System.out.println("printable method");	
	}
	public void show() {
		System.out.println("showable method");
	}
}

public class Testinterdemo {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.print();
		d.show();
	}

}
