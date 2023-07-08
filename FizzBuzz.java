public class FizzBuzz {

	public static void main(String[] args) {
	
			int [] n = {10,11,12,13,14,15,16,17,18,19,20};
			
			String s1="fizz";
			String s2="buzz";
			
			for(int i=0; i<=n.length-1; i++) {
				if(n[i]%3==0&&n[i]%5==0)
				{
					System.out.println(s1+" "+s2);
				}
				else if(n[i]%3==0){
					System.out.println(s1);
				}
				else 
				{
					System.out.println(n[i]);
				}
				
			}
			
	}

}
