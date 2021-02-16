
public class InterfacesConstructor {
			public InterfacesConstructor(int a, int b) {
				a=10;
				b=35;
				System.out.println(a+b);
				}
	public static void main(String[] args) {
		InterfacesConstructor Icon = new InterfacesConstructor(10, 20);
		Parent1 pobj = new Parent1();

		
	}

}
class Parent1{
	public Parent1() {
		System.out.println("I am parent class constructor");
	}
	public void add() {
		System.out.println("I am add method of parent class");
	}
	
}
