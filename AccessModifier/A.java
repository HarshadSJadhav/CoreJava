package Package.Access.A;

class Simple {
	private int data=10;
	private void show() {
		System.out.println("This is private class");
	}
}
public class A{
	public static void main(String args[]) {
		Simple obj=new Simple();
		System.out.println(obj.data);
		obj.show();
	}
}