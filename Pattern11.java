public class Pattern11 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = ++(++a);   // invalid argument to operation ++/--
		System.out.println(b);
	}

}
