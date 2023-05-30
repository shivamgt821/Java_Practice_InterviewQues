public class Method3 {
	double overloadedMethod(double d) {
		return d=d*d;
	}
	int overloadedMethod(int i) {
		return i=i*i;
	}
	public static void main(String[] args) {
		int a = 100;
		Method3 m3 = new Method3();
		System.out.println(m3.overloadedMethod(a));
	}

}
