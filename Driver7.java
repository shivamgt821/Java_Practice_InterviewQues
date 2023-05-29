class A2 
{
	static int a = 20;
	
	public static void demo() 
	{
		System.out.println("demo");
	}
}

class B extends A2 
{
	
	static int b = 30;
//  @Override if i override this method then we got error because of same static method here ,ethod hidening occurs
	public static void demo1() 
	{
		System.out.println("temp");
	}
}
class Driver7 
{
	public static void main(String[] args) 
	{
		System.out.println(A2.a);
		System.out.println(B.b);
	}

}
