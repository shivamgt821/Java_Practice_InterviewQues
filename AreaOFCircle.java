import java.util.Scanner;

public class AreaOFCircle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any raidus do you want to print area of circle");
		int r = scn.nextInt();
		double pi = 3.14;
		System.out.println(pi*r*r);
		System.out.println(2*pi*r);  // Perimeter of circle
		System.out.println(6%3);   // Reminder 
		System.out.println(6/3);   // Quotient
		
	}

}
