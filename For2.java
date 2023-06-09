import java.util.Scanner;
class For2
 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter intial value : ");
		int a=scn.nextInt();
		System.out.print("enter last value : ");
		int b=scn.nextInt();
		int sum=0;
		for(int i=a; i<=b; i++){
		sum+=i;
		System.out.print(i+" "); 
		}
		System.out.println("\nThe sum of total value is = "+ sum);
		
	}
}
