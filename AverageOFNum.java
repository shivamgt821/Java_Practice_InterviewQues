public class AverageOFNum {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7};
		int sum = 0;
		int n = 6;
		
		for(int i=0; i<6; i++) {
			
			sum = sum+a[i];
		}
		System.out.println(sum/n);
	}

}
