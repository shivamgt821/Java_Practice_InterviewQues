import java.util.Scanner;
class ADD
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter two number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=a+b;
		System.out.println("The addition of two number is = "+c);
	}
}
