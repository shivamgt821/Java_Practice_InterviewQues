import java.util.Scanner;
class FactMethod
{
		 static int fact(int n){
		 if(n==0) return 1;

			int fact = 1;
			for (int i = 1; i <=n ; i++){
				fact *= i;
			}
			return fact;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter any number : ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		// fact=1;
		 
		 System.out.println(fact(n));
	}
}
