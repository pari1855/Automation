public class FinalAndFinally extends Parent {
	final static int i =20;
	public void changeValue() {
		System.out.println(i +" I am the Final variable");
	} 
	public void cdisplay1() {
		System.out.println("I am child class display method1");
	}
	public void cdisplay2() {
		System.out.println("I am child class method 2");
	}
	public final void pdisplay4() {
		int a = 20;
		System.out.println("I am child class overridden method: "+a);
	}
	
	public static void main(String[] args) {
	//System.out.println(FinalAndFinally.i+ " I am main value of i");
	Parent obj = new FinalAndFinally();
	obj.pdisplay1();
	obj.pdisplay2();
	obj.pdisplay3();
	obj.pdisplay4();
	
}
}
class Parent{
	public final void pdisplay1() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Parent Class: "+c);
	}
	public void pdisplay2() {
		System.out.println("I am parent class method");
	}
	public void pdisplay3() {
		System.out.println("I am parent class method 2");
	}
	public void pdisplay4() {
		System.out.println("I am parent class method 3");
	}

}
