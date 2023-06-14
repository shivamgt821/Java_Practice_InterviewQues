import java.util.Scanner;
class Payment
  {
		public static void main(String[] args)
		{
		System.out.println("enter payment option");
		String option=new Scanner(System.in).next();
		
		switch (option){
		case "debitcard" :
		System.out.println("paid through debit card");
		break;
		
		case "creditcard" :
		System.out.println("paid through credit card");
		break;

		case "UPI" :
		System.out.println("paid through UPI");
		break;

		default :
		System.out.println("invalid");
		
		}
	}
}
