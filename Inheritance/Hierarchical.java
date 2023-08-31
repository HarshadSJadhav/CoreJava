package Inheritance.pack;
class A{
	void input() {
		System.out.println("Enter your name");
	}
}
class B extends A{
	void show() {
		System.out.println("My name is Tom");
	}
}
class C extends A{
	void display() {
		System.out.println("My name is jerry");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		B obj = new B();
		obj.input();
		obj.show();
		
		C obj1 = new C();
		obj1.input();
		obj1.display();

	}

}
