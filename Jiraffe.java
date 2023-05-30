public class Jiraffe 
{
	Jiraffe(int sugarcanes)
	{
		System.out.println("Eats "+ sugarcanes + " Sugarcanes");
	}
	Jiraffe(int age,int...sugarcanes)
	{
		System.out.println("Eats "+ sugarcanes[0] + " Sugarcanes ");
	}
	public static void main(String[] args) {
		Jiraffe jiff2 = new Jiraffe(40);
		Jiraffe jiff = new Jiraffe(5,10);
	}
}
