public class X1 {

	static int a = 20;
	int b = 30;
	int c = 10;
	
	public static void main(String[] args) {

		X1 x = new X1();
		X1 y = new X1();
		System.out.println(x.a-- + y.b++ + x.b-- +  y.a++ +x.c);
	}

}

// first decrease a value from 20 to 19 but assign 20 then increase b value from 30 to 31 but assign 30 
// again increase a value from 19 to 20 but assign 19 then add c value 10 total sum 20+30+30+19+10 = 109 ans
