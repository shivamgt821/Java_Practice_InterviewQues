public class Demo7 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		boolean res=a++ > b && b++ < a;
		System.out.println(res); 
		System.out.println(a);	// in given && this operator it means first check conditon if true then check 2nd if first false then exceute in first and store the value
		System.out.println(b);
	}

}
