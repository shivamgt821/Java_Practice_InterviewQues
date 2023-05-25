public class Demo4 {

	public static void main(String[] args) 
	{
		int j = 11;
		long i =121;
		shivam(j,i);
	}
	public static void shivam(long j ,int i)  // method shivam(j,i) not matches with shivam(long j , int i)
	{										// and we can't stored long to int variable
		System.out.println(j++);
		System.out.println(i++);  		// if we re-correct the value of i and j like as shivam(i,j) and in method (long i,int j) then execute 
	}

}
