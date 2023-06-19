class Account
{
	public static void fundTransfer(long paytm){
		System.out.println("amt trasfered from paytm");
	}
	public static void fundTransfer(double upi){
		System.out.println("amt trasfered from upi");
	}
	public static void fundTransfer(int atm){
		System.out.println("amt trasfered from atm");
	}
	public static void fundTransfer(String username,String password){
		System.out.println("amt trasfered from online account");
	}
	public static void main(String[] args) {
		fundTransfer(462400098);
		fundTransfer("eiuwf","shibam@123");
		fundTransfer(74624);
		fundTransfer(65.867);
		fundTransfer(100000000.00);
	}
}
