class A56{
	
	A56()
	{
		System.out.println("Constructor");
	}
	{
		System.out.println("Non Static block");	
	}
	static 
	{
		System.out.println("Static block");
	}
}
public class T1 {

	public static void main(String[] args) {

		System.out.println("main Started");	
	//	A56 a = new A56();
		
	}
}
