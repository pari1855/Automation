
public class ConstructorOverloading implements Interface{
	
	public ConstructorOverloading() {
		System.out.println("Default constructor");
	}
	public ConstructorOverloading(int a) {
		System.out.println("I am constructor with one value: "+a);
	}
	public ConstructorOverloading(int a, int b) {
		System.out.println("I am constructor with 2 values: "+(a+b));
	}
	public ConstructorOverloading(int a, float b) {
		System.out.println("Constructor with int and float "+ (a+b));
	}
	public static void main(String[] args) {
		//ConstructorOverloading obj = new ConstructorOverloading();
		//ConstructorOverloading obj1 = new ConstructorOverloading(10);
		//ConstructorOverloading obj2 = new ConstructorOverloading(10, 30);
		//ConstructorOverloading obj3 = new ConstructorOverloading(10, 20.00f);
		//Interface obj4 = new ConstructorOverloading();
		//obj4.abc();
		//obj4.a();
		Interface.display();
		Interface.inte.nestedInterface();
		System.out.println(Interface.inte.a);
	}
	@Override
	public void a() {
		System.out.println("I am interface overridden method by class");
		
	}
}
interface Interface {
	public abstract void a();
	public default void abc() {
		System.out.println("DE FAULT method");
	
}
	public static void display() {
		System.out.println("I'm interface static method.");
	}
	static interface inte{
		public final int a = 30;
		public static void nestedInterface() {
			System.out.println("I'm nested interface method.");
		}
	}
}
