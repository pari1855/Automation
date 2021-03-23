import TestPublic.Parent;
//Importing the interPackages Classes.
public class NestedClasses {
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.display();
		Parent2 obj2 = new Parent2();
		obj2.display();
		}
}

class Parent2{
	public void display() {
		System.out.println("Display: Parent Public");
	}
	private void display1() {
		System.out.println("Display1: Parent Private");
	}
	static final class nesParent{
		public void display() {
			System.out.println("Display: nesParent Public");
		}
		private void display1() {
			System.out.println("Display1: nesParent Private");
		}
	}
}
