import java.util.Scanner;
class Assignment
{
	public static void main(String [] args)
	{
	System.out.println("Enter the number");
	int n=new Scanner(System.in).nextInt();
	if(n%2!=0)
	System.out.println("GOOD MORNING");
	if((n%2==0){
				if(n>=0 && n<=9)
				System.out.println("GOOD AFTERNOON");
				if(n>=10 && n<=100)
				System.out.println("GOOD EVENING");
				if(n>100)
				System.out.println("GOOD NIGHT");
		}
	}
}
