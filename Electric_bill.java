import java.util.Scanner;
class Electric_bill
{
	public static void main(String[] args)
    {
	int a;
	double arrears = 0.0;
	double amt = 0.0;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the units : ");
	a=scn.nextInt();
	System.out.println("Enter arrears : ");
	arrears = scn.nextDouble();
	if(a<=50)
	{
		amt=a*0;
	      System.out.println("Bill amount="+amt);
	}
	
	else if(a>=51 && a<=100)
	{
		amt=(a-50)*3;
		System.out.println("Bill amount="+amt);
	}
	
	else if(a>=101 && a<=150)
	{
		amt=50*3+(a-100)*5;
		System.out.println("Bill amount="+amt);
	}
		
	else if(a>=151 && a<=200)
	{
		amt=50*3+50*5+(a-150)*9;
		System.out.println("Bill amount="+amt);
	}
	else{
		amt=50*3+50*5+50*9+(a-200)*14;
		System.out.println("Bill amount="+amt);
		}
	if(arrears!=0){
			amt = amt + (arrears * 0.15) + arrears;
			System.out.println("The total bill is = " + amt);
		}
		else{
			amt = amt - (arrears * 0.1) + arrears;
			System.out.println("The total bill is = " + amt);
		}
	
	}
}
	
		
	
