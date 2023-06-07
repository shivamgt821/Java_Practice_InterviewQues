import java.util.Scanner;
class Electricity_bill2
{
	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter Your Unit");
		int u=scn.nextInt();
		System.out.println("Enter Your Arrears");
		float a=scn.nextInt();
		float amt=0;

		if(u<=50) System.out.println("Bill below 50 unit : 50 X 0= "+(50*0));

		if(u>50 && u<=100){
				System.out.println("Bill below 50 unit : 50 X 0= "+(50*0));
				System.out.println("Bill after 50 unit to 100 unit :  "+(u-50) + " X 3 = " + ((u-50) * 3 ));
				amt=((u-50)*3);
			}

		if(u>100 && u<=150)
		{
			System.out.println("Bill below 50 unit : 50 X 0= "+(50*0));
			System.out.println("Bill after 50 to 100 unit : 50 X 3 = " + (50*3));
			System.out.println("Bill after 100 unit to 150 unit :  "+(u-100) + " X 5 = " + ((u-100) * 5 ));
			amt = (50*3)+ ((u-100)*5);
		}

		if (u>150 && u<=200)
		{
			System.out.println("Bill below 50 unit : 50 X 0= "+(50*0));
			System.out.println("Bill after 50 to 100 unit : 50 X 3 = " + (50*3));
			System.out.println("Bill after 100 to 150 unit : 50 X 5 = " + (50*5));
			System.out.println("Bill after 150 unit to 200 unit :  "+(u-150) + " X 9 = " + ((u-150) * 9 ));
			amt = (50*3) + (50*5) + ((u-150)*9);
		}

		if(u>200){
			System.out.println("Bill below 50 unit : 50 X 0= "+(50*0));
			System.out.println("Bill after 50 to 100 unit : 50 X 3 = " + (50*3));
			System.out.println("Bill after 100 to 150 unit : 50 X 5 = " + (50*5));
			System.out.println("Bill after 150 to 200 unit : 50 X 9 = " + (50*9));
			System.out.println("Bill after 200 unit :  "+(u-200) + " X 14 = " + ((u-200) * 14 ));
			amt = (50*3) + (50*5) +  (50*9) + ((u-200)*14);
		}

			System.out.println("The amount is : " +amt);
		
		if(a>0)
		{
			System.out.println("Total arrears is : "+a);
			System.out.println("The 15% intrest of Total arrears is :" + (a*0.15f));
			amt=amt+(a*0.15f) +a;
			System.out.println("The total amount after intrest is : " +amt);
		}
		else {
			System.out.println("Total arrears is 0");
			System.out.println("The 10% Discount of Total arrears is :" + (amt*0.10f));
			amt=amt-(a*0.10f);
			System.out.println("The total amount after discount is : " +amt);
		}
	}
}

	
