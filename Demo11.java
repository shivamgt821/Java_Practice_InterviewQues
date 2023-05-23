class Test
{
	static int a = 20;
	public static void test() 
	{
		System.out.println(a);
	}
}

class Demo11 
{
	public static void main(String[] args) 
	{
		(Test.a)--;  // first call a 20 then decrement 19 
		Test.test(); // then after decrement call method test and print store value 19
	}

}
