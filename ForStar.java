import java.util.Scanner;
class ForStar
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter data");
		int n=scn.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
			System.out.print(i);
			}
			System.out.println(" "); 

		}
	}
}



   
