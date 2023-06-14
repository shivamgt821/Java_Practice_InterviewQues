class R
{
	int i;
	static int j;
	public static void main(String[] args)
	{
	 		R e1= new R();
		      R e2= new R();
			e1.i= 10;
			e2.i= 20;
	System.out.println(e1.i);
	System.out.println(e2.i);
	e1.j=30;
	e2.j=40;

	System.out.println(e1.j);
	System.out.println(e2.j);
	}
}
