public class Demo8 {

	public static void main(String[] args) {
		int b = 15;
		for (int a =15; a > -1 ; a--) {
			b++;  // first 15>-1 then b store 16 and start loop 14>-1 store 17 
		}     		// 13 18, 12 19, 11 20, 10 21, 9 22, 8 23, 7 24, 6 25, 5 26 ,4 27 ,3 28, 2 29, 1 30, 0 31, -1 condition false -1 > -1 not possible  
		System.out.println(b);  // so now current b values is 31 
	}
}
