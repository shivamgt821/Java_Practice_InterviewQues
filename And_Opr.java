class And_Opr
{
	public static void main(String[] args)
	{
	int a=5;
	int b=6;
		System.out.println(a++>5 && ++b>6);//false
		System.out.println(a);//6
		System.out.println(b);//6
	
		System.out.println(a++>5 & ++b>6); //true
		System.out.println(a);//7
		System.out.println(b);//7
	}
}
