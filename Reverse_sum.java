import java.util.Scanner;
class Reverse_sum
{
	public static void main(String[] args)
	{
		int num,rem,sum=0;
		System.out.print("Enter any number ");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
	
	   while(num>0)
	   {
	    rem=num%10;
	    num=num/10;
		 sum=sum+rem;
		 System.out.println(rem + " ");
		}
		
		System.out.println("The sum of given reverse number is : "+sum);	
    }
}
