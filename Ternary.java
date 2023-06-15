class Ternary
{
	public static void main(String[] args)
	{
	int age=21;
	String s;
	String p;
	String q;
	String r;
	s=(age>=20)?"asutosh is ready to vote":"asutosh is not ready to vote";
	p=(age>=21)?"asutosh is ready to vote":"asutosh is not ready to vote";
	q=(age>21)?"asutosh is ready to vote":"asutosh is not ready to vote";
	r=(age==21)?"asutosh is ready to vote":"asutosh is not ready to vote";
	int marks=(age>21)?90:35;
	System.out.println(s);
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
	System.out.println(marks);
	}
}
