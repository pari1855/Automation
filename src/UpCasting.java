
public class UpCasting extends Parents {
	void display() {
		System.out.println("child Upcast");
	}
	void display2() {
		System.out.println("child upcast to");
	}
	void child() {
		System.out.println("Child methods");
	}
	public static void main(String[] args) {
		UpCasting obj = new UpCasting();
		Parents obj1 =(Parents)obj;
		System.out.println("Child class methods");
		obj.display();
		obj.display2();
		obj.child();
		obj.parent();
		System.out.println("parent class upcasting methods");
		obj1.display();
		obj1.display2();
		obj1.parent();
		obj.child();
	}
}

class Parents{
	void display() {
		System.out.println("Parent Upcast");
	}
	void display2() {
		System.out.println("Parent upcast to");
	}
	void parent() {
		System.out.println("Parent method");
	}
}