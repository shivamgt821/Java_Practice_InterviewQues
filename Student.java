public class Student {
	
	String name = "rama";
	{
		System.out.println("java"); // we cant put this block to everywhere upper from main method then always show same result java 15 rama
	}
	Student()
	{
		this(15);
		System.out.println(name);
	}
	Student(int a) 
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Student obj = new Student();
		
	}
}
