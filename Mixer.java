class Mixer 
 {
	 private String item;
 }
 
class mix 
	{
		public static mixy()     // return type void is missing
		{
			Mixer m = new Mixer();
			System.out.println(m.item);  // cant call any private member from another class
		}
		public static void main(String[] a) 
		{
			mixy(); // mixy() is undefiend for class mix
		}
}
