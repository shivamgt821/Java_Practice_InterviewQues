import java.util.Scanner;
class Currency_Calculation
	{
		public static void main(String[] args)
	{
		System.out.print("enter amount: ");
		int amt=new Scanner(System.in).nextInt();
		if(amt>=2000){
		System.out.println("2000 X "+(amt/2000));
		amt%=2000;
		}
		if(amt>=500){
		System.out.println("500 X "+(amt/500));
		amt%=500;
		}
		if(amt>=200){
		System.out.println("200 X "+(amt/200));
		amt%=200;
		}
		if(amt>=100){
		System.out.println("100 X "+(amt/100));
		amt%=100;
		}
		System.out.println("other : " +amt+"/-");
		
	}
}
		
		
