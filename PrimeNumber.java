
public class PrimeNumber {

	public static void main(String[] args) {
		// i%2==0 even number or i%2!=0 odd number

//		int i = 3;
//		if (i % 2 == 0)
//			System.out.println("number is even :" + i);
//		else if (i % 2 != 0)
//			System.out.println("number is odd: " + i);
		int n = 17;
		if (n <= 1) {
			System.out.println("N is prime or composite: " + n);

		}
		int c = 2;
		while (c * c <= n) {
			if (n % c == 0) {
				System.out.println("Not prime: " + n);

			}

			c += 1;
			
		}

		System.out.println("It's prime");
	}


}
