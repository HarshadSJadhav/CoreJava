package Inheritance.pack;
class operator1{
	int a,b,c;
	void add() {
		a=50;
		b=50;
		c=a+b;
		System.out.println("the addition is "+c);
	}
	void sub() {
		a=30;
		b=10;
		c=a-b;
		System.out.println("the subtraction is "+c);
	}
}
class operator2 extends operator1{
	void mul() {
		a=30;
		b=2;
		c=a*b;
		System.out.println("the multiplication is "+c);
	}
	void div() {
		a=30;
		b=10;
		c=a/b;
		System.out.println("the division is "+c);
	}
}
class operator3 extends operator2{
	void rem() {
		a=30;
		b=12;
		c=a%b;
		System.out.println("the remainder is "+c);
	}
}
public class Multilevel {

	public static void main(String[] args) {
		System.out.println("your answers are");
		operator3 obj = new operator3();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();
		
	}

}
