class SqurMethod
{
	static void m1(int i)
	{
	System.out.println(i);
	if(i==8) return;
	m1(i*2);
	m1(i*2);
	System.out.println(i);
	}
	public static void main(String[] args)
	{
	m1(2);
	}
}

