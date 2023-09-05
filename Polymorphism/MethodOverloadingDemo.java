//compile time polymorphism
//overloading=same method but diff parameter


//package com.tns.polymorphism;
//public class MethodOverloadingDemo {
//	void add() {
//		int a=10,b=20,c;
//		c=a+b;
//		System.out.println(c);
//	}
//	void add(int x, int y) {
//		int c=x+y;
//		System.out.println(c);
//	}
//	void add(int x,double y) {
//		double c=x+y;
//		System.out.println(c);
//	}
//	public static void main(String[] args) {
//		MethodOverloadingDemo obj= new MethodOverloadingDemo();
//		obj.add();
//		obj.add(10, 40);
//		obj.add(200, 20000.67);
//	}
//
//}


package com.tns.polymorphism;

public class MethodOverloadingDemo {
	int add() {                                   //int method
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
		return c;                                  //need to return c
	}
	void add(int x, int y) {
		int c=x+y;
		System.out.println(c);
	}
	void add(int x,double y) {
		double c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		MethodOverloadingDemo obj= new MethodOverloadingDemo();
		int a=obj.add();                          //define int with method
		obj.add(10, 40);
		obj.add(200, 20000.67);
	}

}

