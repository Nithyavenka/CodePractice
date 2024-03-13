
public class Salary {

	public static int offer(int i) {

		if (i > 10000) {
			i += 2000;
		} else {
			i += 1000;
		}
		return i;

	}

	public static void main(String[] args) {
		int i = 8500;

		int x = offer(i);
		System.out.println(x);

	}

}
