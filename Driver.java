class Color 
{
	int i = 10;
	Color (int i) 
	{
		this.i = i;
	}
	Color ()
	{
		
	}
}

class Red 
{
	int j = 10;
}
class Driver 
{
	public static void main(String[] args) {
		Color c = new Color();
		Red r = new Red();
		c = r;		// class name should be same throw CTE because of datamember mismatch
		System.out.println(r.i); 
	}
}
