class For6
{
	public static void main(String [] args){
		int a=100;
		int b=200;
		int n=1;
		while(true)
		{
		if(n%a==0 && n%b==0) break;
		n++;
		}
		System.out.println(n);
	}
}
