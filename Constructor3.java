public class Constructor3 {
	int birds = 10;
	Constructor3()
	{
		this(20);
	}
	Constructor3(int birds)
	{
		this(30,20);
		System.out.println("Birds=" + birds);
	}
	Constructor3(int parrots,int peacocks)
	{
		System.out.println("Parrots = " + parrots);
	}
	public static void main(String[] args) 
	{
		Constructor3 con = new Constructor3();
	}

}
