public class Demo5 {

	public static void main(String[] args) {
		int a = 40;
		a = add(a*4);
		System.out.println(a);  // add(40*4) = 160 
	}
	public static int add(int a) {
		return a*a;				// return 160*160 = 25600
	}

}
