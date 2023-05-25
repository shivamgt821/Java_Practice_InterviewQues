public class Demo6 
{
	public static void main(String[] args) 
	{
		int a = 10;
		for (int i =10 ;i>-1;i--) 
		{
			if(i>=5)
			System.out.print("*");  // 10>=5,9>=5,8>=5,7>=5,6>=5 5>=5 then print ****** not 4>=5 condition false   
			else
			System.out.print("#"); 	// 4>=5 3>=5 2>=5 1>=5 then print #  not i>-1 so i is not less than 1 so cant take -1 conditon false go to next line 
		}
		
		System.out.println();    		// print next cursor only
	}

}
