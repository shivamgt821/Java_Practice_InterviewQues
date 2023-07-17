import java.util.Scanner;

public class LargestNumberOverGivenInteger {

	public static void main(String[] args)  {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter three integer : ");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		
		if(x > y && x > z) {
			System.out.println("First number is greatest");
		}
		else if(y > x && y > z) {
		System.out.println("Second number is greatest");
		}
		else if(z > x && z > y) {
			System.out.println("Third number is greates");
		}
		else System.out.println("Entered Numbers are not distinct");
	}

}
