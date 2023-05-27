class A3
{
	int a = 10;
}
class B3 extends A3
{
	int b = 20;
}

class C3 extends A3
{
	int c = 30;
}

class D3 extends B3
{
	int d = 40;
}
class E3 extends D3
{
	int e = 50;
}
class F3 extends E3
{
	int f = 60;
}
class G3 extends F3
{
	int g = 70;
}
class H3 extends F3 
{
	int h = 80;
}	
class Driver2 {

	public static void main(String[] args) 
	{
//      B3 ob = new C3();   // Type mismatch: cannot convert from C3 to B3
		B3 ob = new B3(); 
		System.out.println(ob.b);
		
	}

}
