
public class InterfacesConstructor extends Parent1 {
			public InterfacesConstructor(int a, int b) {
				a=10;
				b=35;
				System.out.println("Child class constructor here: "+a+b);
				}
		public void child() {
			System.out.println("I am child method");
		}
	public static void main(String[] args) {
		//Interface implementation by object:
		/*SuperParent obj = new SuperParent() {
			
			@Override
			public void abc() {
				System.out.println("I am interface method");
			}
		};
		obj.abc();
		obj.display();
		*/
		Parent1 pObj = new InterfacesConstructor(10, 30);
		pObj.display();
		pObj.add();
		
		
	}

}
class Parent1 implements SuperParent{
	public Parent1() {
		System.out.println("I am parent class constructor");
	}
	public void add() {
		System.out.println("I am add method of parent class");
	}
	@Override
	public void abc() {
		System.out.println("I am interface overridden method in Paren class");
		
	}
	
}
interface SuperParent{
	final int a =20;
	public abstract void abc();
	public default void display() {
		System.out.println("I am an interface method with final value of: "+a);
	}
}
