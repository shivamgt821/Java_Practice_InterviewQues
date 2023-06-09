import java.util.Scanner;

class Find_Odd_Even_Total 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int num = scn.nextInt();
		

		int countEven = 0;
		int countOdd = 0;

		while(num>0) 
		{
			int rem = num % 10;
			if(num%2 != 0) 
			countOdd++;
			else 
			countEven++;
			num = num/10;
		}
			System.out.println("The Total Odd number is " + countOdd);
			System.out.println("The Total Even number is " + countEven);	
	}	
}
