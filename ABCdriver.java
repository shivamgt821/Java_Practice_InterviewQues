class A4 {
	public static void m1() {
		System.out.println("hii");
	}
}
class B4 extends A4 {
	public static void m1(String a) {
		System.out.println("hi");
	}
}
class C4 extends B4{
	public static void m1(String a) {
		System.out.println("hiii");
	}
}
public class ABCdriver {

	public static void main(String[] args) {
		C4 c = new C4();
		c.m1();
	}

}
