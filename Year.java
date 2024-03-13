
public class Year {


	public static int sum(int x, int y) {
		int sum = (x + y);
		if ((x + y) == sum) {

		}
		return sum;
	}
	public static void main(String[] args) {
		int x = 144;
		int y = 8890;
		int s = sum(x, y);
		System.out.println(s);

		// leap year or not
//		int year = 2023;
//		if (year % 4 == 0) {
//			System.out.println("It's leap year: " + year);
//		} else {
//			System.out.println("It's not a leap year:" + year);
//		}
//
	}

}
