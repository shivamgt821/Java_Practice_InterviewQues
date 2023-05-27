class A1
{
	static int a = 20;
	
	public static void demo() 
	{
		System.out.println("demo");
	}
}

class B1 extends A1 
{
	static int b = 30;
	public static void demo1() 
	{
		System.out.println("temp");
	}
}
public class Driver6 {

	public static void main(String[] args) 
	{
		System.out.println(A1.a);
		System.out.println(B1.b);
	}

}
