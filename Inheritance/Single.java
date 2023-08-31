package Inheritance.pack;
class student{   //parent,super class
	int rollNo,marks;
	String name;
	void input() {
		System.out.println("enter marks rollno and name of student");
	}
}
	class tom extends student{
	void display(){
		rollNo=10;
		name="harshad";
		marks=1;
	
				 
			System.out.println("Marks is "+marks+" of rollno "+rollNo+" and name is "+name);
		
	}	
	}

public class Single {

	public static void main(String[] args) {
		tom obj=new tom();
		obj.input();
		obj.display();
	}
}

