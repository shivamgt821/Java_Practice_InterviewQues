public class Ini2 {
	
	static int a = test();
	
	public static int test() {
		
		System.out.println("test begin");
		System.out.println(a);
		System.out.println("test end");
		
		return 60;
	}
	public static void main(String[] args) {

		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
