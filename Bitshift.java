public class Bitshift {

	public static void main(String[] args) {
		int x=0x80000000;
		System.out.println(x+ " and ");
		x = x >>> 31;
		System.out.println(x);
	}

}
