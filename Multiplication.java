import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// Take a number as input and print the multiplication table for it

//		int x = 16;
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(x + "*" + i + "=" + x * i);
//
//		}
		// Take 2 numbers as inputs and find their lcm and hcf
		// Keep taking numbers as inputs till the user enters ‘x’, after that print sum
		// of all.
		int num = 0;
		int i = 0;
		int total = 0;
		System.out.print("For quit enter any letter or Enter num = ");

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			num = sc.nextInt();
			total += num;
			i++;
			System.out.print("Enter num" + i + "=");

		}
		System.out.print("Total num:" + total);


	}

}
